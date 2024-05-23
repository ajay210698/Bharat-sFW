package com.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	
	
	
	public String GetDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\Zoom\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String data= pobj.getProperty(key);
		
		
		return data;
		
	}
	
	

}
