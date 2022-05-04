package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment01 {
	static void printAll(ArrayList<String> list) {
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
	      
	  
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      printAll(al);
	
	}
	
}
