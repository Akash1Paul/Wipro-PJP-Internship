import java.sql.*;
import java.util.ArrayList;
public class Scenario10 {

	public static void main(String[] args) {
		storeAllRecords();
	}
	static ArrayList<UserBean> storeAllRecords(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM login");
			ArrayList<UserBean> userList = new ArrayList<>();
			while(rs.next()) {
				UserBean user = new UserBean();
				userList.add(user);
				userList.size();
				{
					System.out.println(rs.getString(1)+" - "+ rs.getString(2)+" - "+ rs.getString(3)+" - "+ rs.getString(4)+" - "+ rs.getString(5)+" - "+ rs.getString(6));
				}
			}
		}catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return null;
	}
}
