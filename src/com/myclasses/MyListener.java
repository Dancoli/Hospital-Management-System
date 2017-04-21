package com.myclasses;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by DANCO on 31/03/2017.
 */
public class MyListener implements MessageListener {

    public void onMessage(Message message) {
        try{
TextMessage msg=(TextMessage) message;
System.out.println("following message is received:"+msg.getText());
}catch(JMSException e){System.out.println(e);}
}

}
