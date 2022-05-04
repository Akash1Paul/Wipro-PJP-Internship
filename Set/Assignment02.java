package Set;
import java.util.*;
public class Assignment02 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Bob");
		set.add("jhon");
		set.add("Alise");
		set.add("Richard");
		System.out.println("Original Tree set:" + set);
		Iterator itr1 = set.descendingIterator();
		System.out.println("Element in Reverse Order:");
		while (itr1.hasNext()) {
   			System.out.println(itr1.next());
    	}
		Iterator<String> itr2 = set.iterator();
		String query = "Sahil";
		boolean result = false;
		
		while(itr2.hasNext()) {
			if(itr2.next().equals(query)) {
				result = true;
				break;
			}
		}
		if(result)
			System.out.println(query + " exists");
		else
			System.out.println(query + " doesn't exist");
	}

}
