import java.util.Scanner;

public class Assignment01_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if( num < 0 )
		{
			System.out.println("Number is Negetive");
		}
		else if ( num > 0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}

}
