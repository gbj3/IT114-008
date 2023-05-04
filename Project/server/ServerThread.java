package Project.server;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Project.common.Constants;
import Project.common.Payload;
import Project.common.PayloadType;
import Project.common.RoomResultPayload;
import Project.server.Server;

/**
 * A server-side representation of a single client
 */
public class ServerThread extends Thread {
    private Socket client;
    private String clientName;
    private boolean isRunning = false;
    private ObjectOutputStream out;// exposed here for send()
    // private Server server;// ref to our server so we can call methods on it
    // more easily
    private Room currentRoom;
    private static Logger logger = Logger.getLogger(ServerThread.class.getName());
    private long myClientId;
    private String sender;

    List<String> mutedClients = new ArrayList<String>(); //gbj3 IT114

    public List<String> getMutedClients() {
        return this.mutedClients;
    }
    //mutes clients
    public void mute(String name) {
        name = name.trim().toLowerCase();
        if (!isMuted(name)) {
            mutedClients.add(name);
            saveMuteList();
            syncIsMuted(name, true);
        }
    }

    //unmutes clients
     public void unmute(String name) {
         name = name.trim().toLowerCase();
        if (isMuted(name)) {
            mutedClients.remove(name);
            saveMuteList();
            syncIsMuted(name, false);
        }

    }

     //checks if client is muted
   public boolean isMuted(String name) {
        name = name.trim().toLowerCase();
        return mutedClients.contains(name);
      } 

   // overwrites client's mutedClients gbj3 IT114
   void saveMuteList() {
        String data = clientName + ": " + String.join(", ", mutedClients);
        try {
             FileWriter export = new FileWriter(clientName + ".txt");
             BufferedWriter bw = new BufferedWriter(export);
            bw.write("" + data);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
// loads client's mutedClients
  void loadMuteList() {
           File file = new File(clientName + ".txt");
           if (file.exists()) {
               try (Scanner reader = new Scanner(file)) {
                  String dataFromFile = "";
                  while (reader.hasNextLine()) {
                       String text = reader.nextLine();
                       dataFromFile += text;
                  }
                  dataFromFile = dataFromFile.substring(dataFromFile.indexOf(" ")+1);;
                  if (!dataFromFile.strip().equals("") && !dataFromFile.isEmpty()) {
                      List<String> getClients = Arrays.asList(dataFromFile.split(", "));
                      for (String client : getClients) {
                          mute(client);
                      }
                  }
               }
              catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (Exception e2) {
               e2.printStackTrace();
           }
           }
           System.out.println(mutedClients.toString());
   }

  // sends client mute or unmute
      protected boolean syncIsMuted(String clientName, boolean isMuted) {
       Payload p = new Payload();
       p.setPayloadType(PayloadType.MUTE);
       p.setClientName(clientName);
       p.setFlag(isMuted);
       return send(p);
   }

    public void setClientId(long id) {
        myClientId = id;
    }

    public long getClientId() {
        return myClientId;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public ServerThread(Socket myClient, Room room) {
        logger.info("ServerThread created");
        // get communication channels to single client
        this.client = myClient;
        this.currentRoom = room;

    }

    protected void setClientName(String name) {
        if (name == null || name.isBlank()) {
            logger.warning("Invalid name being set");
            return;
        }
        clientName = name;
    }

    public String getClientName() {
        return clientName;
    }

    public void setSender(String sendee) {
        sender = sendee;
    }

    public String getSender() {
        return sender;
    }

    protected synchronized Room getCurrentRoom() {
        return currentRoom;
    }

    protected synchronized void setCurrentRoom(Room room) {
        if (room != null) {
            currentRoom = room;
        } else {
            logger.info("Passed in room was null, this shouldn't happen");
        }
    }

    public void disconnect() {
        sendConnectionStatus(myClientId, getClientName(), false);
        logger.info("Thread being disconnected by server");
        isRunning = false;
        cleanup();
    }

    // send methods
    @Deprecated
    protected boolean send(String message) {
     // added a boolean so we can see if the send was successful
     try {
         out.writeObject(message);
         return true;
     }
     catch (IOException e) {
         logger.log(Level.INFO, "Error sending message to client (most likely disconnected)");
         e.printStackTrace();
         cleanup();
         return false;
     }
    }

     /***
      * Replacement for send(message) that takes the client name and message and
      * converts it into a payload
      * 
      * @param clientName
      * @param message
      * @return
      */
    protected boolean send(String clientName, String message) {
     Payload payload = new Payload();
     payload.setPayloadType(PayloadType.MESSAGE);
     payload.setClientName(clientName);
     payload.setMessage(message);

     return send(payload);
    }

    public boolean sendReadyStatus(long clientId) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.READY);
        p.setClientId(clientId);
        return send(p);
    }

    public boolean sendRoomName(String name) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.JOIN_ROOM);
        p.setMessage(name);
        p.setSender("server");
        return send(p);
    }

    public boolean sendRoomsList(String[] rooms, String message) {
        RoomResultPayload payload = new RoomResultPayload();
        payload.setRooms(rooms);
        if (message != null) {
            payload.setMessage(message);
            payload.setSender("client");
        }
        return send(payload);
    }

    public boolean sendExistingClient(long clientId, String clientName) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.SYNC_CLIENT);
        p.setClientId(clientId);
        p.setClientName(clientName);
        p.setSender("client");
        return send(p);
    }

    public boolean sendResetUserList() {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.RESET_USER_LIST);
        return send(p);
    }

    public boolean sendClientId(long id) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.CLIENT_ID);
        p.setClientId(id);
        p.setSender("server");
        return send(p);
    }

    public boolean sendMessage(long clientId, String message) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.MESSAGE);
        p.setClientId(clientId);
        p.setMessage(message);
        p.setClientName(clientName);
        p.setSender(clientName);
        return send(p);
    }

    public boolean sendConnectionStatus(long clientId, String who, boolean isConnected) {
        Payload p = new Payload();
        p.setPayloadType(isConnected ? PayloadType.CONNECT : PayloadType.DISCONNECT);
        p.setClientId(clientId);
        p.setClientName(who);
        p.setMessage(String.format("%s the room %s", (isConnected ? "Joined" : "Left"), currentRoom.getName()));
        p.setSender("server");
        return send(p);
    }

    private boolean send(Payload payload) {
        try {
            logger.log(Level.FINE, "Outgoing payload: " + payload);
            out.writeObject(payload);
            logger.log(Level.INFO, "Sent payload: " + payload);
            return true;
        } catch (IOException e) {
            logger.info("Error sending message to client (most likely disconnected)");
            // uncomment this to inspect the stack trace
            // e.printStackTrace();
            cleanup();
            return false;
        } catch (NullPointerException ne) {
            logger.info("Message was attempted to be sent before outbound stream was opened: " + payload);
            // uncomment this to inspect the stack trace
            // e.printStackTrace();
            return true;// true since it's likely pending being opened
        }
    }

    // end send methods
    @Override
    public void run() {
        try (ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(client.getInputStream());) {
            this.out = out;
            isRunning = true;
            Payload fromClient;
            while (isRunning && // flag to let us easily control the loop
                    (fromClient = (Payload) in.readObject()) != null // reads an object from inputStream (null would
                                                                     // likely mean a disconnect)
            ) {
                processPayload(fromClient);

            logger.info("Received from client: " + fromClient);
            } // close while loop
        } catch (Exception e) {
            // happens when client disconnects
            e.printStackTrace();
            logger.info("Client disconnected");
        } finally {
            isRunning = false;
            logger.info("Exited thread loop. Cleaning up connection");
            cleanup();
        }
    }

    void processPayload(Payload p) {
        switch (p.getPayloadType()) {
            case CONNECT:
                setClientName(p.getClientName());
                setSender("server");
                break;
            case DISCONNECT:
                setSender("server");
                Room.disconnectClient(this, getCurrentRoom());
                break;
            case MESSAGE:
                if (currentRoom != null) {
                    currentRoom.sendMessage(this, p.getMessage());
                    setSender(getClientName());
                } else {
                    // TODO migrate to lobby
                    logger.log(Level.INFO, "Migrating to lobby on message with null room");
                    Room.joinRoom(Constants.LOBBY, this);
                }
                break;
            case GET_ROOMS:
                Room.getRooms(p.getMessage().trim(), this);
                setSender("server");
                break;
            case CREATE_ROOM:
                Room.createRoom(p.getMessage().trim(), this);
                setSender("server");
                break;
            case JOIN_ROOM:
                Room.joinRoom(p.getMessage().trim(), this);
                setSender("server");
                break;
            case READY:
                // ((GameRoom) currentRoom).setReady(myClientId);
                break;
            default:
                break;

        }

    }

    private void cleanup() {
        logger.info("Thread cleanup() start");
        try {
            client.close();
        } catch (IOException e) {
            logger.info("Client already closed");
        }
        logger.info("Thread cleanup() complete");
    }

}