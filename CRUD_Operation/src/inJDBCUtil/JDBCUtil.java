//package inJDBCUtil;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Properties;
//
//public class JDBCUtil {
//	public static Connection getJdbcConnection() throws FileNotFoundException {
//		FileInputStream FIS = new FileInputStream("Application.properties ");
//		
//		Properties P = new  Properties();
//		P.load(FIS);
//
//		String url=P.getProperty("url");
//		String user=P.getProperty("user");
//		String password=P.getProperty("password");
//		
//		System.out.println(url);
//		System.out.println(user);
//		System.out.println(password);
//		
//		Connection connection = DriverManager.getConnection(url, user,password);
//		
//		return connection;
//	}
//}
