package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
//		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.print("찾을 이름 입력 : ");
			String find = sc.next();
						
			///////////SQL
			/*
			String sql = "SELECT emp.first_name, emp.last_name, " 
			+ "emp.email, emp.phone_number, emp.hire_date " 
			+ "FROM employees emp "
			+ "WHERE lower(emp.first_name) LIKE " 
			+ "\'%" + find + "%\' "
			+ "OR lower(emp.last_name) LIKE "
			+ "\'%" + find + "%\' "			
			+ "ORDER BY emp.first_name DESC";
			// 보안상 위험, 가독성 해침
			
			
			
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			*/
			// 동적으로 데이터 연결할 공간을 ?로 비워 둔다
			String sql = "SELECT first_name, last_name, "
						+"email, phone_number, hire_date FROM employees "
						+"WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			
			pstmt = conn.prepareStatement(sql); // 실행 계획을 준비해 둔다.
			// 동적 파라미터 설정
			pstmt.setString(1, "%" + find + "%");
			pstmt.setString(2, "%" + find + "%");
			
			// 쿼리 수행
			rs = pstmt.executeQuery();
				
			
			
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
//				stmt.close();
				pstmt.close();
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
