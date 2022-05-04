class Fruits{
	String name;
	String taste;
	int size;
	
	public void eat()
	{
		System.out.println("Fruits Eating.......");
		
	}
}
class Apple extends Fruits{
	Apple()
	{
		name = "Apple";
		taste = "Sweet and Caramelized.";
	}
	public void eat()
	{
		System.out.println("Teste of the " + name + " is " + taste);
	}
}
class Orange extends Fruits{
	Orange()
	{
		name= "orange";
		taste = "Sweet-tert.";
	}
	public void eat()
	{
		System.out.println("Teste of the " + name + " is " + taste);
	}	
}
public class Assignment05 {

	public static void main(String[] args) {
		Fruits f= new Fruits();
		Apple a = new Apple();
		Orange o = new Orange();
		f.eat();
		a.eat();
		o.eat();
		
		
	
		
	}

}
