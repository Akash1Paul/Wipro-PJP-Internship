import java.util.*;
public class Assignment01_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Value : ");
		int value1 = sc.nextInt();
		System.out.println("Enter the Second Value : ");
		int value2 = sc.nextInt();
		if( value1 >0 && value2 >0 ) {// for Non-negetive value
			value1 %= 10;
			value2 %= 10;
			if(value1==value2)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("False");
			}
		}
	}

}
