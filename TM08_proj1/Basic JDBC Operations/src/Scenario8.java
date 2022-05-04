import java.sql.*;

public class Scenario8 {

	public static void main(String[] args) {
		UserBean ub = new UserBean();
		ub.setId("GE1005");
		ub.setPassword("GE1005");
		ub.setName("Getanjali");
		ub.setIncorrectAttempts(0);
		ub.setLockStatus(0); //with 0
		ub.setUserType("Employee");
		System.out.println(addUser(ub));
	}
	static String addUser(UserBean bean) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO login VALUES (?,?,?,?,?,?)");
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			
			if(bean.getLockStatus()==0) {
				ps.addBatch();
				ps.executeBatch();
				return "Success";
			}
			else
			{
				return "Fail";
			}
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
		return "Failure";
	}
}
