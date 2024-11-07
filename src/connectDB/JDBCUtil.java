package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			String url = "jdbc:sqlserver://ROON:1433;databaseName=cinema;encrypt=true;trustServerCertificate=true";
//			String username = "sa";
//			String password = "sapassword";
//			Connection connection = DriverManager.getConnection(url,username,password);
//			System.out.println("Kết nối thành công");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	private static final String URL = "jdbc:sqlserver://ROON:1433;databaseName=cinema;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sapassword";
    private static Connection connection = null;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getConnection();
        if (conn != null) {
            System.out.println("Connection established successfully.");
            JDBCUtil.closeConnection();
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
}
