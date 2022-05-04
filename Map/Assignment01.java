package Map;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
class CountryTable {
	private Hashtable<String, String> mapobj;
	
	public CountryTable() {
		mapobj = new Hashtable<String, String>();
	}
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
		mapobj.put(CountryName, capital);
		return mapobj;
	}
	
	public String getCapital(String CountryName) {
		if(CountryName.isBlank())
			return "No Country Found";
		else
			return mapobj.get(CountryName);
		
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = mapobj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			
			if (e.getValue().equals(capitalName))
				return e.getKey();
		}
		return "No Capital Found";
	}
	
	public Hashtable<String, String> swapKyeValue() {
		Hashtable<String, String> mapobj2 = new Hashtable<String, String>();
		
		Set<Entry<String, String>> set = mapobj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			mapobj2.put(e.getValue(), e.getKey());
		}
		
		return mapobj2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = mapobj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}
	public ArrayList<String> InArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = mapobj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getValue());
		}
		return list;
	}
}

public class Assignment01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryTable countryTable = new CountryTable();

		countryTable.saveCountryCapital("India", "Delhi");
		countryTable.saveCountryCapital("Japan", "Tokyo");
		countryTable.saveCountryCapital("USA", "Washington, D.C.");
		countryTable.saveCountryCapital("India", "Delhi");
		
		System.out.println(countryTable.getCapital("India"));
		System.out.println(countryTable.getCountry("Tokyo"));
		System.out.println(countryTable.toArrayList());
		System.out.println(countryTable.InArrayList());
		
		Hashtable<String, String> mapobj2 = countryTable.swapKyeValue();
		System.out.println(mapobj2);
	}
}
