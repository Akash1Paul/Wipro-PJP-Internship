package Method_Reference;


interface FactReference{
	int fact(int n);
}
public class Assignment01 {
	int factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *=1;
		}
		return fact;
	}

	public static void main(String[] args) {
		Assignment01 obj = new Assignment01();
		FactReference ref = obj :: factorial;
		System.out.println(ref.fact(5));
		System.out.println(ref.fact(8));
	}

}
