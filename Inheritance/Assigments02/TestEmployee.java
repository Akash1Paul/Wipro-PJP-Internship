package Assigments02;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("Akash",1000000,2022,"076746242");
		
		System.out.println("Details of Employee");
		System.out.println("Name : " + e.getName());
		System.out.println("Annual Salary : " + e.getannualSalary());
		System.out.println("Year of Starting : " + e.getyearOfSrart());
		System.out.println("National Insurance Number : " + e.getinsuranceNum());
	}

}
