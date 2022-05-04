import java.sql.*;

public class Scenario11 {

	public static void main(String[] args) {
		getNames();
	}
	static String[] getNames() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT name FROM login");
		
			while(rs.next()) {
				String [] names= {rs.getString(1)};
				for(int i=0;i<names.length;i++)
				{
					System.out.println(rs.getString(1));
				}
			}
		}catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return null;
	}
}
