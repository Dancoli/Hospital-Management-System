package com.MultiClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DANCO on 07/04/2017.
 */
public class Server {

    public Server (int port) throws IOException {
        ServerSocket server = new ServerSocket (port);
        while (true) {
            Socket client = server.accept ();
            System.out.println ("Accepted from " + client.getInetAddress ());
            ChatHandler c = new ChatHandler (client);
            c.start ();
        }
    }
}
