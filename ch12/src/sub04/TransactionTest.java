package sub04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 *  날짜 : 2025/07/25
 *  이름 : 박민규
 *  내용 : Transaction 실습하기
 */


public class TransactionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		
		//DB정보 
		final String Host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String User = "bank";
		final String Pass = "1234";
		
		Connection conn = null;
		
		
		try {
			conn = DriverManager.getConnection(Host, User, Pass);
			
			// 자동커밋 해제(트렌젝션 시작)
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE - 10000 WHERE ACC_CID=? ";
			String sql2 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE + 10000 WHERE ACC_CID=? ";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "103-23-51094");
			
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "220-83-52237");
			
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("예기치 못한 에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); // 트렌젝션 작업 확정(트렌젝션 실행)
			
			//종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	
			
		}
		System.out.println("프로그램 종료...");	
		
	}

}
