
public class Assignment10 {
static void EvenOdd(int arr[], int n) {
	int j = -1,temp;
	for(int i=0;i<n;i++)
	{
		if(arr[i] % 2 == 0) {
			j++;
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
	public static void main(String[] args) {
		int arr[] = {3,3,2};
		int n = arr.length;
		
		EvenOdd(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print (arr[i]+" ");
		}
	}

}
