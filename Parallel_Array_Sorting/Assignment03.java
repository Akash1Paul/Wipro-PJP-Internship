package Parallel_Array_Sorting;

import java.util.Arrays;

public class Assignment03 {
	public static void main(String[] args) {
		int [] Array = {2,5,34,8,6,56,3,9,10,7};
		Arrays.parallelSort(Array,0,5);
		for(int i=0;i<Array.length;i++)
			System.out.print(Array[i]+" ");
	}
}
