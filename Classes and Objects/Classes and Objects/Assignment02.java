class Calculator{
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1,num2);
	}
}
public class Assignment02 {

	public static void main(String[] args) {
	Calculator c = new Calculator();
	System.out.println(c.powerInt(2, 2));
	System.out.println(c.powerDouble(1.5,2));

	}

}
