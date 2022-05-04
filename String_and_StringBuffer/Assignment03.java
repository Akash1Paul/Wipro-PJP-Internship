package String_and_StringBuffer;
import java.util.*;
public class Assignment03 {
	static String copyString(String str) {
		String repStr = str.substring(0, 2);
		String outStr = " ";
		for(int i=0;i<str.length();i++)
		{
			outStr +=repStr;
		}
		return outStr;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println(copyString(str));
	}

}
