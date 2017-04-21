package com.Websocket;


import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by DANCO on 05/04/2017.
 */
@ServerEndpoint("/test")
public class Websocket {

    @OnOpen
    public void newConnection()
    {
        System.out.println("New Connection established");
    }
    @OnMessage
    public void message(String message )
    {
        System.out.println(message);
    }
}

