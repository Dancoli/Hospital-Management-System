package com.clinic;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name="ServletConn",urlPatterns={"ServletConn"})
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Connection connection=null;
		DataSource datasource=null;
		Context context=null;
		try{
			context=new InitialContext();
			datasource=(DataSource) context.lookup("java:jboss/datasources/dancoh");
			connection=datasource.getConnection();
		}catch(NamingException ne)
		{
			
		}catch(SQLException se)
		{
			
		}
		try {
			Statement stm=connection.createStatement();
			String str="SELECT name FROM person";
			ResultSet rs=stm.executeQuery(str);
			while(rs.next())
			{
				String name=rs.getString("name");
				out.println("<li>"+name+"</li>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

