package String_and_StringBuffer;
import java.util.Scanner;
public class Assignment01 {
	
	static boolean isPalindrome(String str) {
		int len = str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i) != str.charAt(len-i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		if(isPalindrome(str))
		{
			System.out.println("String is Palindrome !");
		}
		else
		{
			System.out.println("String is not Palindrome !");
		}
	}

}
