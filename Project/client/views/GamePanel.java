package Project.client.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Project.client.Client;
import Project.client.IClientEvents;
import Project.common.Constants;

public class GamePanel extends JPanel implements IClientEvents {

    int numReady = 0;

    private static Logger logger = Logger.getLogger(GamePanel.class.getName());
    GamePanel self;
    JPanel gridLayout;
    JPanel readyCheck;

    public GamePanel() {
        gridLayout = new JPanel();
        buildReadyCheck();
        this.setLayout(new BorderLayout());
        this.add(gridLayout, BorderLayout.CENTER);
        this.add(readyCheck, BorderLayout.SOUTH);
        self = this;
        Client.INSTANCE.addListener(this);
        this.setFocusable(true);
        this.setRequestFocusEnabled(true);

    }

    private void buildReadyCheck() {
        if (readyCheck == null) {
            readyCheck = new JPanel();
            readyCheck.setLayout(new BorderLayout());
            JTextField tf = new JTextField(String.format("%s/%s", 0, Constants.MINIMUM_PLAYERS));
            tf.setName("readyText");
            readyCheck.add(tf, BorderLayout.CENTER);
            JButton jb = new JButton("Ready");
            jb.addActionListener((event) -> {
                try {
                    Client.INSTANCE.sendReadyStatus();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            readyCheck.add(jb, BorderLayout.SOUTH);
        }
    }



    // Although we must implement all of these methods, not all of them may be
    // applicable to this panel
    @Override
    public void onClientConnect(long id, String clientName, String message) {

    }

    @Override
    public void onClientDisconnect(long id, String clientName, String message) {

    }

    @Override
    public void onMessageReceive(long id, String message) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onReceiveClientId(long id) {

    }

    @Override
    public void onSyncClient(long id, String clientName) {
    }

    @Override
    public void onResetUserList() {
        // players.clear();
    }

    @Override
    public void onReceiveRoomList(String[] rooms, String message) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onRoomJoin(String roomName) {
        logger.info(
                Constants.ANSI_BRIGHT_BLUE + String.format("Received room name %s", roomName) + Constants.ANSI_RESET);

        if (roomName.equalsIgnoreCase("lobby")) {
            setVisible(false);
        } else {
            setVisible(true);
        }

    }


}