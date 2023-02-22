package Part3HW;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.*;

/**
 * A server-side representation of a single client
 */
public class ServerThread extends Thread {
    private Socket client;
    private boolean isRunning = false;
    private ObjectOutputStream out;//exposed here for send()
    private Server server;// ref to our server so we can call methods on it
    // more easily
    private boolean gameActive = false;
    private int secretNum;

    private void info(String message) {
        System.out.println(String.format("Thread[%s]: %s", getId(), message));
    }

    public ServerThread(Socket myClient, Server server) {
        info("Thread created");
        // get communication channels to single client
        this.client = myClient;
        this.server = server;

    }

    public void disconnect() {
        info("Thread being disconnected by server");
        isRunning = false;
        cleanup();
    }

    public boolean send(String message) {
        // added a boolean so we can see if the send was successful
        try {
            out.writeObject(message);
            return true;
        } catch (IOException e) {
            info("Error sending message to client (most likely disconnected)");
            // comment this out to inspect the stack trace
            // e.printStackTrace();
            cleanup();
            return false;
        }
    }

    @Override
    public void run() {
        info("Thread starting");
        try (ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(client.getInputStream());) {
            this.out = out;
            isRunning = true;
            String fromClient;
            while (isRunning && // flag to let us easily control the loop
                    (fromClient = (String) in.readObject()) != null // reads an object from inputStream (null would
                                                                    // likely mean a disconnect)
            ) {

                info("Received from client: " + fromClient);

                if (fromClient.startsWith("flip")) { // client says flip to run method and server broadcasts message with their ID
                    String result = coinToss(fromClient);
                    server.broadcast(result, this.getId());
                }

                if (fromClient.startsWith("start")) { //gbj3 IT114-008 2/21/23 if client starts, make random num 1-100
                    gameActive = true;
                    secretNum = (int)(Math.random()*100) + 1;
                    server.broadcast("Game started", this.getId());
                }
                else if (fromClient.startsWith("stop")) { //stop game
                    gameActive = false;
                    server.broadcast("Game over", this.getId());
                }
                else if (fromClient.startsWith("guess")) { //if starts with guess, parse it
                    if (gameActive) {
                        String[] parts = fromClient.split(" ");
                        if (parts.length == 2) {
                            try {
                                int guess = Integer.parseInt(parts[1]); //ignores the "guess" message
                                if (guess == secretNum) // right
                                    server.broadcast(String.format("%s guessed %d and that's right!", this.getName(), guess), this.getId());
                                else //wrong
                                    server.broadcast(String.format("%s guessed %d and that's wrong!", this.getName(), guess), this.getId());
                            }
                            catch (NumberFormatException e) { //if invalid
                                info("Invalid guess");
                        }
                    }
                }
                }
                else 
                    server.broadcast(fromClient, this.getId()); //regular messages
            } // close while loop
        } catch (Exception e) {
            // happens when client disconnects
            e.printStackTrace();
            info("Client disconnected");
        } finally {
            isRunning = false;
            info("Exited thread loop. Cleaning up connection");
            cleanup();
        }
    }

    private void cleanup() {
        info("Thread cleanup() start");
        try {
            client.close();
        } catch (IOException e) {
            info("Client already closed");
        }
        info("Thread cleanup() complete");
    }

    private String coinToss(String command) { //gbj3 IT114-008 2/21/23
        Random rand = new Random();
        String[] words = command.split(" ");
        String player = "Player " + this.getId(); //gets user
        if (words.length > 1) 
            player = words[1];
        boolean isHeads = rand.nextBoolean(); // true=heads false=tails
        String result = player + " flipped a coin and got " + (isHeads ? "heads":"tails"); //message depending on users outcome
        return result;
    }
}    
