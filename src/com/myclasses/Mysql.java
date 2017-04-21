package com.myclasses;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Named(value = "MYSQL")
public class Mysql implements DatabaseOperationsInterface{
	private Connection connect=null;
	private Statement statement=null;
	private ResultSet resultset = null;
	public Connection connect() {
		try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:jboss/datasources/danco");
            connect = dataSource.getConnection();
            if (connect != null){
            	System.out.println("connected");
			}
        } catch (NamingException ne) {

        } catch (SQLException se) {
        }
		return connect;
	}

	public ResultSet Read(String read){		
		try {
			statement = connect.createStatement();
			resultset=statement.executeQuery(read);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultset;
	}
	public boolean Update(String update) {
		
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

	public boolean delete() {
		
		return false;
	}
	public boolean write(String s) {
		try {
			statement = connect.createStatement();
			statement.executeUpdate(s);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
