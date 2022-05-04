import java.util.Arrays;
public class Assignment01 {

	public static void main(String[] args) {
		int array [] = {19,14,20,18,2};
		int sum = 0;
		System.out.println("Array: "+Arrays.toString(array));
		for(int i=0;i<array.length;i++)
		{
			sum +=array[i];
		}
		double avg = sum/array.length;
		System.out.println("The sum of the array is : "+sum);
		System.out.println("The average of the array is : "+avg);
	}

}
