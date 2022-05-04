import java.sql.*;


public class Scenario2 {
	public static void main(String[] args) {
		System.out.println(getIncorrectAttempts("AB1001"));
	}
	static String getIncorrectAttempts(String userID) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT IncorrectAttempts FROM login WHERE userID='"+userID+"'");
			while(rs.next()) {
				int val = rs.getInt("IncorrectAttempts");
				if(val==0) {
					System.out.println("No Incorrect Attempts");
				}
				else if(val==1) {
					System.out.println("One Time");
				}
				else {
					System.out.println("Incorrect Attempts Extended");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return "Program Ends";
	}
}
