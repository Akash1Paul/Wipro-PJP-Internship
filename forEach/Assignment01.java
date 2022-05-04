package forEach;
import java.util.ArrayList;

public class Assignment01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		al.forEach(l1 -> System.out.println(l1));

	}

}
