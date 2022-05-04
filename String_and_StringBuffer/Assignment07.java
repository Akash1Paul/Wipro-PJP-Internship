package String_and_StringBuffer;
import java.util.*;
public class Assignment07 {
	static String withoutX(String str)
	{
		if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
			return str.substring(1, str.length()-1);
		else
			return str;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println(withoutX(str));

	}

}
