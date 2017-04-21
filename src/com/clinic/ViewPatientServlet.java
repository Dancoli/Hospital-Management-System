package com.clinic;

import com.ClinicInterfaces.NurseI;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DANCO on 21/04/2017.
 */

public class ViewPatientServlet extends HttpServlet {
    @EJB
    NurseI p;
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       request.setAttribute("pat",p);

       RequestDispatcher rd = request.getRequestDispatcher("ViewPatient.jsp");

       try {
           rd.forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       }

   }

}
