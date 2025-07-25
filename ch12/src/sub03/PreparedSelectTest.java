package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub02.User1Vo;
import sub02.User1Vo;

/*
 *  날짜 : 2025/07/25
 *  이름 : 박민규
 *  내용 : 자바 Insert 실습하기
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		//DB정보 
		String Host = "jdbc:oracle:thin:@localhost:1521:xe";
		String User = "mingyupark1997";
		String Pass = "1234";	
		
		//조회 결과 반환용 리스트 생성
		List<User1Vo> users = new ArrayList<User1Vo>();
		
		
		try {
			//데이터 베이스 접속
			
			 Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//SQL 실행객체 생성(PreparedStatement)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20);// 1번째 쿼리파라미터(?)에 나이 숫자 20 바인딩
			
			//SQL 실행
			ResultSet rs =psmt.executeQuery(); // SELECT 실행하기 때문에 executeQuert()로 실행해야 ResultSet 변환됨
			
			//결과처리(SELECT 경우)
			while(rs.next()) {
				
				
				//VO객체 생성 : VO 객체는 데이터 베이스에서 조회된 결과로 초기화된 읽기전용 객체
				User1Vo vo = new User1Vo();
				vo.setUser_id(rs.getString(1));
				vo.setUser_name(rs.getString(2));
				vo.setUser_hp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
							
			}
			
			//데이터 베이스 종료
			rs.close();
			psmt.close();
			conn.close();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1Vo user : users) {
			System.out.println(user);	
		}
		
		System.out.println("Select 완료...");
		
		
	}

}
