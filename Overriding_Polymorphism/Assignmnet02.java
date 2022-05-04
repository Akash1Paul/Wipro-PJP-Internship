class shape{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends shape{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends shape{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erasing Triange");
	}
}
class Square extends shape{
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	public void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Assignmnet06 {
	public static void main(String [] args)
	{
		shape c = new Circle();
		shape t = new Triangle();
		shape s = new Square();
		
		c.draw();
		c.erase();
		System.out.println();
		t.draw();
		t.erase();
		System.out.println();
		s.draw();
		s.erase();
	}
}
