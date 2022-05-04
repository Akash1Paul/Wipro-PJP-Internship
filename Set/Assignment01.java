package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class HashSetDemo{
	String countryName;
	HashSet set = new HashSet<>();
	
	public HashSet<Boolean> addCountry(String countryName){
		set.add(countryName);
		return set;
	}
	
	public String findCountry(String CountryName) {
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
		}
		return "Country Not Found";
	}
	void printAllCountries() {
		//   set.add(countryName);
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println();
		
		Enumeration<String> en = Collections.enumeration(set);
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		
		List list = new ArrayList(set);
		ListIterator it =  list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Assignment01 {
	public static void main(String[] args) {
		HashSetDemo d = new HashSetDemo();
		d. addCountry("India");
		d. addCountry("USA");
		d. addCountry("Russia");
		d. addCountry("Bangladesh");
		d. addCountry("China");
		
		System.out.println("India: " + d.findCountry("India"));
		System.out.println("Japan: " + d.findCountry("Japan"));
		System.out.println();
		d.printAllCountries();
		
	}
	
}
