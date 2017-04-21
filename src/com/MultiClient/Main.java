package com.MultiClient;

import java.io.IOException;

/**
 * Created by DANCO on 07/04/2017.
 */
public class Main {
    public static void main (String args[]) throws IOException {
        if (args.length != 1)
            throw new RuntimeException ("Syntax: ChatServer <port>");
        new Server (Integer.parseInt (args[0]));
    }

}
