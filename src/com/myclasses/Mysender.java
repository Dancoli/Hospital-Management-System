package com.myclasses;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 * Created by DANCO on 31/03/2017.
 */
public class Mysender {
    public static void main(String[] args) {
//Create and start connection  
        InitialContext ctx = null;
        try {
            ctx = new InitialContext();
        QueueConnectionFactory f = null;
            f = (QueueConnectionFactory) ctx.lookup("java:jboss/ee/concurrency/factory/default");
        QueueConnection con = null;
            con = f.createQueueConnection();
            con.start();
        QueueSession ses = null;
            ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue t = null;
            t = (Queue) ctx.lookup("default");
        QueueSender sender = null;
            sender = ses.createSender(t);
        TextMessage msg = null;
            msg = ses.createTextMessage();
      String s = "Dan";
            msg.setText(s);
            sender.send(msg);
            System.out.println("Message successfully sent.");
            con.close();

        } catch (JMSException e) {
            e.printStackTrace();
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
