package com.myclasses;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by DANCO on 31/03/2017.
 */
public class MyReciever {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            QueueConnectionFactory f = (QueueConnectionFactory) ctx.lookup("myQueueConnectionFactory");
            QueueConnection con = f.createQueueConnection();
            con.start();
            QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue t = (Queue) ctx.lookup("myQueue");
            QueueReceiver receiver = ses.createReceiver(t);

            MyListener listener = new MyListener();
            receiver.setMessageListener(listener);
            System.out.println("Receiver1 is ready, waiting for messages...");
            System.out.println("press Ctrl+c to shutdown...");
            while (true){
                Thread.sleep(1000);
            }
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (JMSException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}