package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 *  날짜 : 2025/07/25
 *  이름 : 박민규
 *  내용 : 자바 Select 실습하기
 */


public class SelectTest {
	public static void main(String[] args) {
		final String Host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String User = "mingyupark1997";
		final String Pass = "1234";

		List<User1Vo> users = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(Host, User, Pass);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM USER1";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				User1Vo vo = new User1Vo();
				vo.setUser_id(rs.getString(1));
				vo.setUser_name(rs.getString(2));
				vo.setUser_hp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				users.add(vo);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (User1Vo user : users) {
			System.out.println(user);
		}
		System.out.println("Select 완료...");
	}
}