package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	
	public static Connection getConnection()
	{
		Connection conn = null;
		
		String port ="3306";
		String dbName = "library";
		String username = "root";
		String password ="root265";
		String hostname ="localhost";
		
		 String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName +"?sessionVariables=wait_timeout=1" ;

		 try {

	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            conn = (Connection) DriverManager.getConnection(url, username, password);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return conn;
	}
	

    
}
