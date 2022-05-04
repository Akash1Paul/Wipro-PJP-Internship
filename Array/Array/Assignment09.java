
public class Assignment09 {
	static void withoutTen(int [] nums)
	 {
		int [] tab = new int [nums.length];
		int counter=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 10)
			{
				tab[counter++] = nums[i];
			}
		}	
		for(int i=0;i<tab.length;i++)
		{
			System.out.print(tab[i]+" ");
		}
	}
	 public static void main(String[]args)
	 {
		 int [] arr = {1,10,10,2};
		 withoutTen(arr);
		 
	 }
}


