class Box
{
	public double height;
	public double width;
	public double depth;
	public void dimension(int height,int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	double calcVolume() {
		return height*width*depth;
	}
}
public class Assignment01 {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.dimension(20, 30, 60);
		System.out.println("The Volume of box is : " +b1.calcVolume());
		
	}

}
