package test;

public class TestPackage {

	public static void main(String[] args) {
		foundation f = new foundation();
		//f.var1  =2; ////error - not accessible (private variable)
		f.var2 = 3;
		f.var3 = 4;
		f.var4 = 5;
		//System.out.println(foundation.var1);	
		System.out.println(f.var2);
		System.out.println(f.var3);
		System.out.println(f.var4);

	}

}
