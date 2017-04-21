package com.clinic;

import com.myclasses.OnDanLoad;
import com.myclasses.OnpageLoad;

import javax.inject.Named;
import javax.jms.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by DANCO on 29/03/2017.
 */
@WebServlet(name="lookups",urlPatterns={"lookups"})
public class ProgramImp extends HttpServlet {

//@Inject
//@Types(Types.Type.OnDanLoad)
//Event<OnDanLoad>on;
//@Inject
//@Types(Types.Type.OnpageLoad)
//Event<OnpageLoad> onLoad;
////@EJB(mappedName = "Phones")
////Phones p;
//@EJB
//AAAAAA aaaaaa;

@Named(value= "java:/jms/SmsConnectionFactory")
    ConnectionFactory cf;
@Named(value= "java:/jms/ticketing/SmsQueue")
    Destination destination;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out =response.getWriter();
OnpageLoad onpageLoad = new OnpageLoad();
OnDanLoad l =new OnDanLoad();
//out.println(p.AddInventory());
//       onLoad.fire(onpageLoad);
//       on.fire(l);
//       out.println(onpageLoad.getMes());
//        out.println(l.getSs());
//aaaaaa.deposit(1000);
//aaaaaa.widhdraw(500);
//out.println(aaaaaa.getbalance());
        try {
            //Authentication info can be omitted if we are using in-vm
            QueueConnection connection = (QueueConnection)
                    cf.createConnection();

            try {
                QueueSession session =
                        connection.createQueueSession(
                                false,
                                Session.AUTO_ACKNOWLEDGE
                        );

                try {
                    MessageProducer producer =
                            session.createProducer(destination);

                    try {
                        TextMessage message =
                                session.createTextMessage(
                                       "WHAT"
                                );

                        producer.send(message);

                        out.println(
                               "Excuse Me"
                        );
                    } finally {
                        producer.close();
                    }
                } finally {
                    session.close();
                }

            } finally {
                connection.close();
            }

        } catch (Exception ex) {
            ex.printStackTrace(out);
        }
}


}


