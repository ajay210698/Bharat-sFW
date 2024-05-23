package com.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	
           public 	Connection conn;
	
	public Connection ConnectingToTheDataBase(String url, String username, String password) throws SQLException
	{
		try {
		Driver driv = new Driver();
		DriverManager.registerDriver(driv);
		  conn=   DriverManager.getConnection(url, username, password);
		
		}
		catch (Exception e) {
			System.out.println("error");
		}
		return conn;
		
		
	}
	
	public ResultSet ExecuteSelectQuery(String query)
	    
	{
		ResultSet rs = null;
		try {
		Statement state= conn.createStatement();
	     
		rs= state.executeQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return rs;
		}
	
	public int ExecuteNonSelectQuery(String Query) {
		int rs=0; 
		
		try {
		Statement sate= conn.createStatement();
	     rs= sate.executeUpdate(Query);
	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return rs;
	}
	
	public void CloseDataBaseConnection() throws SQLException
	{
		conn.close();
	}


}
