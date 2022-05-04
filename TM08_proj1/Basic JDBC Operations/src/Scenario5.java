import java.sql.*;

public class Scenario5 {

	public static void main(String[] args) {
		System.out.println(changedName("RS1003", "AKSHAY"));
	}
	static String changedName(String id, String name) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE login SET name='"+name+"'WHERE userID='"+id+"'");
			
			int UpdateCount = 0;
			UpdateCount = stmt.getUpdateCount();
			
			if(UpdateCount!=0) {
				System.out.println("Success");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return name;
	}
}
