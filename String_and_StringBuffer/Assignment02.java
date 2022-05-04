package String_and_StringBuffer;
import java.util.*;
public class Assignment02 {
	static String appenedThemTogether(String str1, String str2)
	{
		String outStr = "";
		if(str1.charAt(str1.length()-1) == str2.charAt(0))
			outStr = str1.substring(0,str1.length()-1)+str2;
		else
			outStr = str1 +" "+ str2;
		return outStr.toLowerCase();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second String : ");
		String str2 = sc.nextLine();
		
		System.out.println(appenedThemTogether(str1,str2));
	}

}
