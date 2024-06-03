package com.comcast.crm.Contact_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class dataBaseConnection {
	
	@Test
	public void connectingToTheDase() throws SQLException
	{
		
		Driver jdriver= new Driver();
		DriverManager.registerDriver(jdriver);
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Bharath@123");
		Statement state= conn.createStatement();
		ResultSet set= state.executeQuery("select * from actor");
		while(set.next()) {
			System.out.println(set.getString(1)+set.getString(2));
		}
		conn.close();
		
		
	}

}
