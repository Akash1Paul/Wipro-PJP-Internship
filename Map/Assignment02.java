package Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
class ContactList {
	TreeMap<String, Integer> contacts = new TreeMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}


	@Override
	public String toString() {
		return "ContactList [contacts=" + contacts + "]";
	}
	

	public Integer getNumber(String name) {
		return contacts.get(name);
		
	}
	public String getName(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			
			if (e.getValue().equals(number))
				return e.getKey();
		}
		return "No Capital Found";
	}
	
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e);
		}
	}
}
public class Assignment02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ajay", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Vijay", 98765432);
				

		System.out.println(contactsList.getNumber("Ajay"));
		System.out.println(contactsList.getName(100));
		
		System.out.println();
		contactsList.listAllContacts();
	}
}
