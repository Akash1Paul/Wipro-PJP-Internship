import java.sql.*;
public class Scenario6 {

	public static void main(String[] args) {
		System.out.println(changePassword("NewPassword"));
	}
	static String changePassword(String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE login SET password='"+password+"' WHERE userType='Admin'");
			
			int UpdateCount=0;
			UpdateCount=stmt.getUpdateCount();
			
			if(UpdateCount!=0) {
				System.out.println("Changed");
			}
			else
			{
				System.out.println("0");
			}
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return password;
	}
}
