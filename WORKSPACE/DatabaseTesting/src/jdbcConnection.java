import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host ="localhost";
		String port ="3306";

		Connection con= DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/world","root","root");
	}

}
