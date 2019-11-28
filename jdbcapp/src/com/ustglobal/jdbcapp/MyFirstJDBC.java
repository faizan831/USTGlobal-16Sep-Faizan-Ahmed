package com.ustglobal.jdbcapp;

import java.sql.*;


import com.mysql.jdbc.Driver;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		//	  Step2     protocol/subprotocol/subname(domain/port/db_name/query string)
			
			//step 3 Issue SQL Query
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//end of main

}//end of MYFirstJDBC
