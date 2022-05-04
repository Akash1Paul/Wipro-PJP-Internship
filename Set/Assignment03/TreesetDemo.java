package Set;

import java.util.Comparator;
import java.util.TreeSet;
import java.lang.Float;
class Employee  {
	int empID;
	String name;
	float salary ;
	 Employee() {}
	 Employee(int empID, String name, float salary)
	    {
	        this.empID = empID;
	        this.name = name;
	        this.salary = salary;
	    }
	 
	    @Override public String toString()
	    {
	        return "" + this.empID + " " + this.name + " "
	            + this.salary;
	    }
}
class ThirdComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        if (e1.salary > e2.salary) {
            return -1;
        }
        else if (e1.salary < e2.salary) {
            return 1;
        }
        else {
            return Float.compare(e1.salary, e2.salary) ;
        }
    }
}
class FirstComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
    	return Float.compare(e1.salary, e2.salary) ;
    }
}

public class TreesetDemo {
	public static void main(String[] args) {
		
		TreeSet<Employee> set = new TreeSet<>(new FirstComparator());

	    set.add(new Employee(1, "ram", 2400));
	    set.add(new Employee(2, "krishna", 2300));
	    set.add(new Employee(3, "sita", 2600));
	    set.add(new Employee(4, "lakshman", 2500));

    // printing each employee object
    for (Employee employee : set) {
        System.out.println(employee);
    }
	
   
	}
	
}
