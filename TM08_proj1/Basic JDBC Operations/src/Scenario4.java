import java.sql.*;

public class Scenario4 {

	public static void main(String[] args) {
		System.out.println(getLockStatus(0));
	}
	static int getLockStatus(int LockStatus) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select count(LockStatus) FROM login WHERE lockstatus='"+LockStatus+"'");
			
			while(rs.next()) {
				System.out.println("Total rows with lockStatus 0 ="+rs.getInt("count(LockStatus)"));
			}
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return LockStatus;
	}
	
}
