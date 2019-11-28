package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DynamicDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 get the connection
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =  DriverManager.getConnection(url);
			//step 3 issue SQL Query
			String sql = "delete from employee_info where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			
			
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
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main()


}
