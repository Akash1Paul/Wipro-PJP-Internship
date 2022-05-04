
public class Assignment08 {

	public static void main(String[] args) {
		int [] array = {10, 3, 6, 1, 2, 7, 9};
		int sum = 0;
		int flag = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == 6)
			{
				flag = 1;
			}
			else if(array[i]==7)
			{
				flag = 0;
				i++;
			}
			if(flag != 1)
			{
				sum = sum + array[i];
			}
			
		}
		System.out.println(sum);
	}

}
