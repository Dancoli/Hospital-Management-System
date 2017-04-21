package com.clinic;

import com.myclasses.DatabaseOperationsInterface;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Role extends HttpServlet{
	@Inject 
	@Named(value = "MYSQL")
	DatabaseOperationsInterface s;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		s.connect();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
		String login="SELECT * FROM person WHERE username='"+username+"' AND pass='"+password+"' AND role='"+type+"'";
		try {
			if(s.Read(login).next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("./"+type+".jsp");
			}
			else
			{
				request.setAttribute("Error", "<span class='form-helper btn btn-danger btn-block'>Incorrect username and password</span>");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                try {
					rd.include(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
