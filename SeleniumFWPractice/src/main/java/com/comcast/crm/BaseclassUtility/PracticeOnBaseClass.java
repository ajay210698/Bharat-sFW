package com.comcast.crm.BaseclassUtility;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.generic.databaseutility.DataBaseUtility;

public class PracticeOnBaseClass {
	
	DataBaseUtility dutil= new DataBaseUtility();
	ResultSet rs;
@Test
public void GettuingData() throws SQLException
{
	dutil.ConnectingToTheDataBase("jdbc:mysql://106.51.90.215:3333/projects", "root@%", "root");
	rs=dutil.ExecuteSelectQuery("select * from project");
	 while(rs.next()) 
	  {
		  System.out.println(rs.getString(1));
	  }
	  
	
	
	}
	
	
	

}
