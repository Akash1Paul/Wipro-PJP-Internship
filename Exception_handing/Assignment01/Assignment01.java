package Exception_handing;
import java.util.*;
public class Assignment01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array ");
		int len = sc.nextInt();
		int [] array = new int [len];
		System.out.println("Enter the elements in the array ");
		try {
			for(int i=0;i<array.length;i++)
			{
				array[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array elemets you want to access ");
		
				int s = sc.nextInt();
		
				System.out.println(array[s]);
				System.out.println("The array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}
