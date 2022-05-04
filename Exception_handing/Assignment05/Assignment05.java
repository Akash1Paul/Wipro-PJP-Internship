package Exception_handing;
class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		System.out.println("Invalid Age");
	}
}
public class Assignment05 {

	public static void main(String[] args) throws InvalidAgeException {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		if(age>=18 && age<60)
			System.out.println("Name: " + name + " Age: " +age);
		else
			throw new InvalidAgeException();
	}

}
