package forEach;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	String address;
	double salary;
	public Employee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
}
public class Assignment02 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"James","Kolkata",10000.0);
		Employee emp2 = new Employee(2,"Kames","Punjub",20000.0);
		Employee emp3 = new Employee(3,"Arun","London",40000.0);
		Employee emp4 = new Employee(4,"Ajoy","UK",30000.0);
		Employee emp5 = new Employee(5,"Anil","Delhi",15000.0);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		empList.forEach(emp -> System.out.println("ID : " + emp.id + 
				" Name : " + emp.name + " Address : " + emp.address + " Salary : " + emp.salary));
		
	}

}
