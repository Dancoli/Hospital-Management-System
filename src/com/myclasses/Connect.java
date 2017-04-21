package com.myclasses;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connect {
	private Connection connect=null;
	private Statement statement=null;
	private ResultSet resultset = null;
	public void getCon()//Method that is used to make connection to the database
	{
		 try {
	            Context context = new InitialContext();
	            DataSource dataSource = (DataSource) context.lookup("java:jboss/datasources/danco");
	            connect = dataSource.getConnection();
	        } catch (NamingException ne) {
	          
	        } catch (SQLException se) {
	        }
		
	}
	public boolean writeToDabase( String s)//Method that is used to insert data into the database and it receives the statements as a string
	{
		try {
			statement = connect.createStatement();
			statement.executeUpdate(s);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean updateDatabase(String update)// Method to update the database it also receive statements as a string
	{
		try {
			statement=connect.createStatement();
			statement.executeUpdate(update);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public ResultSet queryDatabase(String read) throws SQLException  //QueryDatabase method is used in data retrieval from the database through queries
	{
		statement = connect.createStatement();		
		try {
			resultset=statement.executeQuery(read);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultset;
		
	}
	

}
