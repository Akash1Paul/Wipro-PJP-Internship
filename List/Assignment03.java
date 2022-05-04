package List;
import java.util.*;
public class Assignment03 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(23);
		v.add(34);
		v.add(45);
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element + " ");
		}
		System.out.println();
		
		ListIterator<Integer> litr = v.listIterator();
		while(litr.hasNext()){
			Object element = litr.next();
			System.out.println(element + " ");
		}
	}

}
