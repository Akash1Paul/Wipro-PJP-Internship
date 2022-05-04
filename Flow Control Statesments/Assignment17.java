
public class Assignment17 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int last;
		int reverse = 0;
		while(num>0)
		{
			last = num%10;
			reverse = reverse*10+last;
			num = num/10;
		}
		if(temp == reverse)
		{
			System.out.println(temp +  " is a Palimdrome");
		}
		else
		{
			System.out.println(temp +  " is not a Palimdrome");
		}

	}

}
