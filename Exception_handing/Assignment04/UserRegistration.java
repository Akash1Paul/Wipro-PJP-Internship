package Exception_handing;
import java.util.*;
class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");

	}
}
public class UserRegistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "", countryName = "";
		System.out.print("Enter the name of user :");
		String UserName = sc.nextLine();
		System.out.print("Enter country name :");
		String UserCountry = sc.nextLine();
		UserRegistration u = new UserRegistration();
		try {
			u.registerUser(UserName, UserCountry);
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
