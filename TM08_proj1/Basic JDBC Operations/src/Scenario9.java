import java.util.ArrayList;
import java.sql.*;
public class Scenario9 {

	public static void main(String[] args) {
		getUsers("Admin");
	}
	static ArrayList<UserBean> getUsers(String userType){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM login WHERE usertype='"+userType+"'");
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
