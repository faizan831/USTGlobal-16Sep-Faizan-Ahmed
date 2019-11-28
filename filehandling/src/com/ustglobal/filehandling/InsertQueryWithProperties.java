package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;   

public class InsertQueryWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step 1 load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			String driver =prop.getProperty("driver-class-name");
//			Class.forName("com.mysql.jdbc.Driver");
			
			String url =prop.getProperty("url");
			//step 2 get the connection
			
			conn =  DriverManager.getConnection(url, prop);
			//step 3 issue SQL Query
			String select = prop.getProperty("select-query");
			String sql = select;
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name =  args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
//			int count = stmt.executeUpdate(sql);
			int count = pstmt.executeUpdate();
			
			//step 4 read the result 
			System.out.println(count + " Row(s) inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//step 5 close all JDBC Object
			try {
				if(conn!=null) {
					conn.close();
				}
//				if(stmt!=null) {
//					stmt.close();
//				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//end of main()


}
