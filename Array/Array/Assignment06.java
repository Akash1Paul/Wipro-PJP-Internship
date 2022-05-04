import java.lang.reflect.Array;

public class Assignment06 {

	public static void main(String[] args) {
		int arr[] = {23,45,3,6,78,12};
		int n = Array.getLength(arr);
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
