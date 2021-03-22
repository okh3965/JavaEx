package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.print("찾을 이름 입력 : ");
			String find = sc.next();
						
			///////////
			String sql = "SELECT emp.first_name, emp.last_name, " 
			+ "emp.email, emp.phone_number, emp.hire_date " 
			+ "FROM employees emp "
			+ "WHERE emp.first_name LIKE " 
			+ "\'%" + find + "%\' "
			+ "OR emp.last_name LIKE "
			+ "\'%" + find + "%\' "			
			+ "ORDER BY emp.first_name DESC";

			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			
			/////////////
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String eMail = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String hireDate = rs.getString(5);
				
				
				System.out.printf("[First Name : %s],  [Last Name : %s],  [Email : %s],  " + 
									"[Phone Number : %s],  [Hire Date : %s]%n",
									firstName, lastName, eMail, phoneNumber, hireDate);
			}
			/////////////
		} catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
