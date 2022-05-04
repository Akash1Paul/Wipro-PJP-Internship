package Exception_handing;
import java.util.*;

class NegetiveValuesException extends Exception{
	public NegetiveValuesException() {
		System.out.println("NegativeValuesException occured.");
	}
}

class ValueOutOfRangeException extends Exception{
	public ValueOutOfRangeException()
	{
		System.out.println("ValueOutOfRangeException occured.");
	}
}
public class Assignment03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i < 2;i++)
		{
			String name = " ";
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			try {
				name = sc.nextLine();
				if(sc.hasNextInt()) 
					sub1 = sc.nextInt();
				else
					throw new NumberFormatException();
				if(sc.hasNextInt())
					sub2 = sc.nextInt();
				else
					throw new NumberFormatException();
				if(sc.hasNextInt())
					sub3 = sc.nextInt();
				else
					throw new NumberFormatException();
				if(sub1<0) throw new NegetiveValuesException();
				if(sub1>100) throw new ValueOutOfRangeException();
				
				if(sub2<0) throw new NegetiveValuesException();
				if(sub2>100) throw new ValueOutOfRangeException();
				
				if(sub3<0) throw new NegetiveValuesException();
				if(sub3>100) throw new ValueOutOfRangeException();
			}catch(ArithmeticException e) {
				
				System.out.println(e.getMessage());
			}
			catch(NegetiveValuesException e){
				
				System.out.println(e.getMessage());
			}
			catch(ValueOutOfRangeException e){
				
				System.out.println(e.getMessage());
			}
			
		
		System.out.println("Name: " + name);
		System.out.println("Marks of subject A: " + sub1);
		System.out.println("Marks of subject B: " + sub2);
		System.out.println("Marks of subject C: " + sub3);
		
		}
		sc.close();
	}
	

}
