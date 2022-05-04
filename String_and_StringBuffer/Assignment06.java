package String_and_StringBuffer;
import java.util.*;
public class Assignment06 {
	static String shortLongShort(String stra, String strb)
	{
		if(stra.length()<strb.length())
		{
			return stra + strb + stra;
		}
		else
		{
			return strb + stra + strb;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String stra = sc.nextLine();
		System.out.println("Enter the second String : ");
		String strb = sc.nextLine();
		
		System.out.println(shortLongShort(stra,strb));
	}

}
