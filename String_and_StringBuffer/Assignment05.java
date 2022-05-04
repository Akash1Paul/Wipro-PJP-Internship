package String_and_StringBuffer;
import java.util.*;
	
public class Assignment05 {
	static String firstAndLast(String str)
	{
		return str.substring(1,str.length()-1);
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println(firstAndLast(str));
	}

}
