package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			String driver=prop.getProperty("driver-class-name");
//			Class.forName(driver);
			
			String url =prop.getProperty("url");
			
		//	  Step2     protocol/subprotocol/subname(domain/port/db_name/query string)
			
			//step 3 Issue SQL Query
			conn = DriverManager.getConnection(url, prop);
			stmt = conn.createStatement();
			String select = prop.getProperty("select-query");
			String sql = select;
			rs = stmt.executeQuery(sql);
			
			//step 4 read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
						
				System.out.println("Id is "+id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
				System.out.println("***************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// Step 5 close all the JDBC Objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main


}
