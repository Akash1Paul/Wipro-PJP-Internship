import java.util.Arrays;
import java.util.*;
public class Assignment03 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int[] array = {1,14,34,56,7};
		System.out.println("Array "+Arrays.toString(array));
		System.out.println("Enter the element which you want to search : ");
		int needle = sc.nextInt();
		
		int index = -1;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] == needle) {
				index = i;
				break;
			}
		}

		System.out.println(index);
		
	}
}
