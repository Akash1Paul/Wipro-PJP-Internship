package Funtional_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1 {
	private int id;
	private String name;
	private double salary;
	Employee1(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101,"Sachin",20000));
		list.add(new Employee1(102,"Kohli",5000));
		list.add(new Employee1(103,"Dhoni",58000));
		list.add(new Employee1(104,"Raina",97000));
		list.add(new Employee1(105,"Rahul",40000));
		list.add(new Employee1(104,"Rohit",9800));
		list.add(new Employee1(105,"Mohit",9000));
		
		Predicate<Double> p = i -> i < 10000;
		ArrayList<String> res = new ArrayList<>();
		list.forEach(
		i -> {
			if(p.test(i.getSalary()))res.add(i.getName());
			}
		);
		System.out.println(res);
	}

}