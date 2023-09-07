package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "Qqaz1470!";

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();

		sc.close();

		try {

			// step1:載入驅動；類別載入器找DRIVER，可以完成底層通訊的部分
			Class.forName(DRIVER);
			System.out.println("載入成功");

			// step2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

			// step3:送出SQL指令(靜態)
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department values (50,'人事部','南京復興')");
//			System.out.println(count + "row(s) updated.");

			// 動態SQL指令
			ps = con.prepareStatement("insert into department values (?, ?, ?)");

			// 要先釐清?代表的欄位，設定相對應的值；?只針對參數
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);

			ps.executeUpdate();

//			rs = stmt.executeQuery("select * from department order by deptno desc");
//			while(rs.next()) {
////				int deptno = rs.getInt("deptno");
////				String dname = rs.getString("dname");
////				String loc = rs.getString("loc");
//				
//				//欄位的索引值；JDBC從1開始
//				//注意事項：欄位順序會按到SQL的指令有關
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				System.out.println("DEPTNO = " + deptno);
//				System.out.println("DNAME = " + dname);
//				System.out.println("LOC = " + loc);
//				System.out.println("====================");
//			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}

		}

	}
}
