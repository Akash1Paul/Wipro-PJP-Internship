import java.sql.*;

public class Scenario7 {

	public static void main(String[] args) {
		UserBean ub = new UserBean();
		ub.setId("PR1004");
		ub.setPassword("PR1004");
		ub.setName("Pranav");
		ub.setIncorrectAttempts(0);
		ub.setLockStatus(0);
		ub.setUserType("Employee");
		addUser(ub);
	}
	static void addUser(UserBean bean) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			System.out.println("Connection Established: "+con);
			
			PreparedStatement ps = con.prepareStatement("insert into login values (?,?,?,?,?,?)");
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			
			ps.addBatch();
			ps.executeBatch();
			
			int UpadteCount=0;
			UpadteCount = ps.getUpdateCount();
			if(UpadteCount!=0)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Fail");
			}
		
		}
		catch(Exception e) {
			System.out.println("Connection Not Established:" +e);
		}
	}
}
