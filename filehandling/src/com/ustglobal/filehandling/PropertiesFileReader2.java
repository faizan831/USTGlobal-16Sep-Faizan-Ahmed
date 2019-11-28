package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader2 {
	public static void main(String[] args) {
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String passward = properties.getProperty("passward");
			
			System.out.println("Name :"+url);
			System.out.println("Company :"+user);
			System.out.println("GF :"+passward);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
