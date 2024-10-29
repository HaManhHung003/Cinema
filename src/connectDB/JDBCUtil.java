package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://ROON:1433;databaseName=cinema;encrypt=true;trustServerCertificate=true";
			String username = "sa";
			String password = "sapassword";
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Kết nối thành công");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
