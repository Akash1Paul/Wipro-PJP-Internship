package String_and_StringBuffer;
import java.util.*;
public class Assignment04 {
	static String firstHalfString(String str)
	{
		if(str.length()%2==0)
		{
			return str.substring(0,str.length()/2);
		}
		else
			return null;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println(firstHalfString(str));

	}

}
