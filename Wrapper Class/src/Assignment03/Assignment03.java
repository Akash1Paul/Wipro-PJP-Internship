package Assignment03;
import java.util.*;
public class Assignment03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the integer number (1 - 225) : ");
		int num = sc.nextInt();
		String output = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
		System.out.println(output);

	}

}
