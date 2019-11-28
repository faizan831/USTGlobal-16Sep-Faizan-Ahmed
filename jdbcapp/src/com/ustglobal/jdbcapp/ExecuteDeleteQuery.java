package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//Step 1 load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get the connection
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =  DriverManager.getConnection(url);
			//step 3 issue SQL Query
			String sql = "delete from employee_info where id = 7";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4 read the result 
			System.out.println(count + " Row(s) deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//step 5 close all JDBC Object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main()

}//end of Execute Delete Query
