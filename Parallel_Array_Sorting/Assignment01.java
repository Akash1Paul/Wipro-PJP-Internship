package Parallel_Array_Sorting;

import java.util.Arrays;

public class Assignment01 {
	public static void main(String[] args) {
		int [] Array = {2,5,34,8,6,56,3,9,10,7};
		Arrays.parallelSort(Array);
		for(int i=0;i<Array.length;i++)
			System.out.print(Array[i]+" ");
		System.out.println("\nSum of max and min value : "+(Array[0]+Array[9]));
	}
}
