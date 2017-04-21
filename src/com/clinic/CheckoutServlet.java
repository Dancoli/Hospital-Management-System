package com.clinic;

import com.myclasses.Connect;
import com.myclasses.DatabaseOperationsInterface;
import com.myclasses.Patient;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckoutServlet extends HttpServlet{
	@Inject 
	@Named(value = "MYSQL")
	DatabaseOperationsInterface l;
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
{
	Patient patient=new Patient();
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	Connect con=new Connect();
	l.connect();
	 Date dNow = new Date( );
     SimpleDateFormat time = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	
}
}
