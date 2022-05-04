import java.util.*;
public class Assignment04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first character : ");
		char char1 = sc.next().charAt(0);
		System.out.println("Enter the second character : ");
		char char2 = sc.next().charAt(0);
		if(char1 > char2)
		{
			System.out.println(char2+","+char1);
		}
		else
		{
			System.out.println(char1+","+char2);
		}
	}

}
