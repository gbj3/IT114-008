package Project.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import Project.server.Server;
import java.util.Random;

import Project.common.Constants;

public class Room implements AutoCloseable {
    // server is a singleton now so we don't need this
    // protected static Server server;// used to refer to accessible server
    // functions
    private String name;
    private List<ServerThread> clients = new ArrayList<ServerThread>();
    private boolean isRunning = false;
    private final static Logger log = Logger.getLogger(Room.class.getName());
    // Commands
    private final static String COMMAND_TRIGGER = "/";
    private final static String CREATE_ROOM = "createroom";
    private final static String JOIN_ROOM = "joinroom";
    private final static String DISCONNECT = "disconnect";
    private final static String LOGOUT = "logout";
    private final static String LOGOFF = "logoff";
    private static Logger logger = Logger.getLogger(Room.class.getName());
	private final static String FLIP = "flip";
	private final static String ROLL = "roll";
    private final static String MUTE = "mute";
    private final static String UNMUTE = "unmute";

    public Room(String name) {
        this.name = name;
        isRunning = true;
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return isRunning;
    }

    protected synchronized void addClient(ServerThread client) {
        if (!isRunning) {
            return;
        }
        client.setCurrentRoom(this);
        if (clients.indexOf(client) > -1) {
            logger.warning("Attempting to add client that already exists in room");
        } else {
            clients.add(client);
            client.sendResetUserList();
            syncCurrentUsers(client);
            sendConnectionStatus(client, true);
        }
    }

    protected synchronized void removeClient(ServerThread client) {
        if (!isRunning) {
            return;
        }
        // attempt to remove client from room
        try {
            clients.remove(client);
        } catch (Exception e) {
            logger.severe(String.format("Error removing client from room %s", e.getMessage()));
            e.printStackTrace();
        }
        // if there are still clients tell them this person left
        if (clients.size() > 0) {
            sendConnectionStatus(client, false);
        }
        checkClients();
    }

    private void syncCurrentUsers(ServerThread client) {
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread existingClient = iter.next();
            if (existingClient.getClientId() == client.getClientId()) {
                continue;// don't sync ourselves
            }
            boolean messageSent = client.sendExistingClient(existingClient.getClientId(),
                    existingClient.getClientName());
            if (!messageSent) {
                handleDisconnect(iter, existingClient);
                break;// since it's only 1 client receiving all the data, break if any 1 send fails
            }
        }
    }

    /***
     * Checks the number of clients.
     * If zero, begins the cleanup process to dispose of the room
     */
    private void checkClients() {
        // Cleanup if room is empty and not lobby
        if (!name.equalsIgnoreCase(Constants.LOBBY) && (clients == null || clients.size() == 0)) {
            close();
        }
    }
    Random rand = new Random();
    protected synchronized void roll(ServerThread client, String message) { //gbj3 IT114
        String[] str = message.split(" "); //split in array
            try {
                Integer.parseInt(str[1]); //try to parse if it can, continue
                int num = Integer.parseInt(str[1]);
                int result = (int)(Math.random() * num)+1; //random * # of sides
                sendMessage(client, "<b> rolled " + result + "</b>");
            }
            catch (Exception e) {
                String[] parts = str[1].split("d"); //split by d
                int dice = Integer.parseInt(parts[0]);
                int sides = Integer.parseInt(parts[1]);
                int total = 0;
                for (int i=0; i<dice; i++) { //loop based on num of dice
                    total += (int)(Math.random() * sides + 1);
                }
                sendMessage(client, "<b> rolled " + total + "</b>"); }
            }

    protected synchronized void flip(ServerThread client) {
        int result = rand.nextInt(2); //will generate between 0/1
        String message;
        if(result == 0)
            message = " flipped heads";
        else 
            message = " flipped tails";
        sendMessage(client, "<b>" + message + "</b>");
    }

    /***
     * Helper function to process messages to trigger different functionality.
     * 
     * @param message The original message being sent
     * @param client  The sender of the message (since they'll be the ones
     *                triggering the actions)
     */
    @Deprecated // not used in my project as of this lesson, keeping it here in case things
                // change
    private boolean processCommands(String message, ServerThread client) {
        boolean wasCommand = false;
        try {
            if (message.startsWith(COMMAND_TRIGGER)) {
                String[] comm = message.split(COMMAND_TRIGGER);
                String part1 = comm[1];
                String[] comm2 = part1.split(" ");
                String command = comm2[0];
                String roomName;
                wasCommand = true;
                switch (command) {
					case FLIP:
                    flip(client);
                    wasCommand = true;
                    break;
					case ROLL:
						roll(client, message);
						break;
                    case MUTE: //gbj3 IT114
                        String[] muted = comm2[1].split(", ");
                        List<String> muteList = new ArrayList<String>();
                        for (String user : muted) {
                            if (!client.isMuted(user)) {
                                client.mute(user);
                                muteList.add(user);
                            }
                        }
                        
                        wasCommand = true;
                        break;
                    case UNMUTE:
                        String[] unmuted = comm2[1].split(", ");
                        List<String> unmuteList = new ArrayList<String>();
                        for (String user : unmuted) {
                            if (client.isMuted(user)) {
                                client.unmute(user);
                                unmuteList.add(user);
                            }
                        }
                        wasCommand = true;
                        break;
                    case CREATE_ROOM:
                        roomName = comm2[1];
                        Room.createRoom(roomName, client);
                        break;
                    case JOIN_ROOM:
                        roomName = comm2[1];
                        Room.joinRoom(roomName, client);
                        break;
                    case DISCONNECT:
                    case LOGOUT:
                    case LOGOFF:
                        Room.disconnectClient(client, this);
                        break;
                    default:
                        wasCommand = false;
                        break;
                }
            }
            else if (message.indexOf("@") > -1) { //gbj3 IT114
                String command = "";
                String[] comm = message.split("@");
                String part1 = comm[1];
                String[] comm2 = part1.split(" @");
                List<String> users = new ArrayList<String>();
                // get list of intended users 
                for (String user : comm2) {
                    if(!user.equals(comm2[comm2.length-1])) {
                        users.add(user.toLowerCase());
                    }
                    else {    // get message
                        String[] pm = user.split(" ", 2);
                        String last = pm[0];
                        users.add(last.toLowerCase());
                        command = pm[1];
                    }
                }
                users.add(client.getClientName());
                sendPrivateMessage(client, command, users);

                wasCommand = true;
        }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return wasCommand;
    }

    // Command helper methods
    protected static void getRooms(String query, ServerThread client) {
        String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
        client.sendRoomsList(rooms,
                (rooms != null && rooms.length == 0) ? "No rooms found containing your query string" : null);
    }

    protected static void createRoom(String roomName, ServerThread client) {
        if (Server.INSTANCE.createNewRoom(roomName)) {
            Room.joinRoom(roomName, client);
        } else {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
        }
    }

    /**
     * Will cause the client to leave the current room and be moved to the new room
     * if applicable
     * 
     * @param roomName
     * @param client
     */
    protected static void joinRoom(String roomName, ServerThread client) {
        if (!Server.INSTANCE.joinRoom(roomName, client)) {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
        }
    }

    protected static void disconnectClient(ServerThread client, Room room) {
        client.disconnect();
        room.removeClient(client);
    }
    // end command helper methods

    /***
     * Takes a sender and a message and broadcasts the message to all clients in
     * this room. Client is mostly passed for command purposes but we can also use
     * it to extract other client info.
     * 
     * @param sender  The client sending the message
     * @param message The message to broadcast inside the room
     */
    protected synchronized void sendMessage(ServerThread sender, String message) { //gbj3 IT114
        if (!isRunning) {
            return;
        }
        logger.info(String.format("Sending message to %s clients", clients.size()));
        if (sender != null && processCommands(message, sender)) {
            // it was a command, don't broadcast
            return;
        }
        long from = sender == null ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread client = iter.next();   
            if(!client.isMuted(sender.getClientName())) {
                boolean messageSent = client.sendMessage(from, Server.processMessage(message));
                if (!messageSent) {
                    handleDisconnect(iter, client);
                }
            }
        }
    }
    protected void sendPrivateMessage(ServerThread sender, String message, List<String> users) { //gbj3 IT114
        if (processCommands(message, sender)) {
            // it was a command, don't broadcast
            return;
        }
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread client = iter.next();
                // send message if sender not muted
            if(users.contains(client.getClientName().toLowerCase())) {
                if (!client.isMuted(sender.getClientName())){
                    boolean messageSent = client.send(sender.getClientName(), message);
                    if (!messageSent) {
                        iter.remove();
                    }
                }
            }
        }
        }

    protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread receivingClient = iter.next();
            boolean messageSent = receivingClient.sendConnectionStatus(
                    sender.getClientId(),
                    sender.getClientName(),
                    isConnected);
            if (!messageSent) {
                handleDisconnect(iter, receivingClient);
            }
        }
    }

    private void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
        iter.remove();
        logger.info(String.format("Removed client %s", client.getClientName()));
        sendMessage(null, client.getClientName() + " disconnected");
        checkClients();
    }

    public void close() {
        Server.INSTANCE.removeRoom(this);
        isRunning = false;
        clients.clear();
    }
}