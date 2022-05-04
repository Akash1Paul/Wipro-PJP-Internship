import java.sql.*;
public class Scenario3 {

	public static void main(String[] args) {
		System.out.println(characterUserType("TA1002"));
	}
	static String characterUserType(String userID) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			System.out.println(userID);
			
			stmt.executeUpdate("UPDATE login SET usertype='Admin' WHERE userid='"+userID+"'");
			int UpdateCount=0;
			UpdateCount = stmt.getUpdateCount();
			
			if(UpdateCount!=0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Failed");
			}
		
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return "User Changed";
	}

}
