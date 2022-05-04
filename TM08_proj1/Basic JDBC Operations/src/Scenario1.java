
import java.sql.*;


public class Scenario1 {
	public static void main(String[] args) {
		System.out.println(getUserType("AB1001"));
	}
	static String getUserType(String userID) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			System.out.println(userID);
			
			ResultSet rs = stmt.executeQuery("SELECT UserType FROM login WHERE userID='"+userID+"'");
			while(rs.next()) {
				System.out.println("User Type For UserID(" +userID+")= "+rs.getString("UserType"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return "Success";
	}
}
