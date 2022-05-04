package String_and_StringBuffer;

import java.util.Scanner;

public class Assignment09 {
	static String mergeStrings(String str1, String str2) {
		String bigStr = str1.length() > str2.length() ? str1 : str2;
		String smallStr = str1.length() < str2.length() ? str1 : str2;
		String outStr = "";

		for (int i = 0; i < smallStr.length(); i++) {
			outStr += str1.charAt(i);
			outStr += str2.charAt(i);
		}
		//Concatenate characters which're left of bigString
		outStr += bigStr.substring(smallStr.length(), bigStr.length());
		
		return outStr;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String stra = sc.nextLine();
		System.out.println("Enter the second String : ");
		String strb = sc.nextLine();
		
		System.out.println(mergeStrings(stra,strb));

	}

}
