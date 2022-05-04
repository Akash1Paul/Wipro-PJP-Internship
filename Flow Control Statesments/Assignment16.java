import java.util.*;
public class Assignment16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int last, reverse = 0;
		while(num>0)
		{
			last = num%10;
			reverse = reverse*10+last;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
