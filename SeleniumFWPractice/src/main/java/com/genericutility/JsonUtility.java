package com.genericutility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonUtility {
	public String GetTheDataFromJsonFile(String key) throws JsonIOException, Throwable, FileNotFoundException {
		
		
		JsonParser parser= new JsonParser();
		 Object obj= parser.parse(new FileReader("C:\\Users\\bhara\\selenium\\SeleniumFWPractice\\files\\jsoncommodata.json"));
		 JsonObject jobj=(JsonObject)obj;
	String data= jobj.get(key).toString();
		
		
	return data;	
	}

}
