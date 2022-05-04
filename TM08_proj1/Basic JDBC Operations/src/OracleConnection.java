import java.sql.*;

public class OracleConnection {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
		}catch(Exception e) {
			System.out.println("Connection Not Established: "+e);
		}
	}
}
