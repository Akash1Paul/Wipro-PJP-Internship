class Animal{
	void eat(){
		System.out.println("Animal is Eating");
	}
	void sleep() {
		System.out.println("Animal is Sleeping");
	}
}
class Bird extends Animal{
	void fly() {
		System.out.println("Bird is Flying");
	}
}
public class Assignment04 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		System.out.println();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}