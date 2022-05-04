import java.util.Arrays;
public class Assignment05 {

	public static void main(String[] args) {
		int array [] = {19,14,20,18,2};
		
		Arrays.sort(array);
		System.out.println("Largest Two Number are : "+array[array.length-1] +","+ array[array.length-2]);
		System.out.println("Smallest Two Number are : "+ array[0] +","+ array[1]);
	}

}
