package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB 접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "testuser", "test1234");
			// 3. statement 객체 생성
			String sql = "INSERT INTO emp_ex2 (empno, ename, salary) VALUES (emp_ex2_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			// 4. sql 실행(처리)
			// select -> executeQuery : ResultSet리턴
			// insert/update/delete -> executeUpdate : int 리턴
			pstmt.setString(1, "서민구");
			pstmt.setInt(2, 1000);
			int r = pstmt.executeUpdate();

			// 5. 결과처리(커서 형태)
			if (r > 0)
				System.out.println("정상적으로 등록되었습니다.");

			// 6. 해제(close) -> finally

			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}

	}

}
