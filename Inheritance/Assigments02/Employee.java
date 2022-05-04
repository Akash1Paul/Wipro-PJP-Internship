package Assigments02;

public class Employee extends Person {
	private double annualSalary;
	private int yearOfStart;
	private String insuranceNum;
	Employee(String name,double annualSalary,int yearofStart,String insuranceNum){
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfStart = yearofStart;
		this.insuranceNum = insuranceNum;
	}
	public double getannualSalary() {
		return annualSalary;
	}
	public int getyearOfSrart() {
		return yearOfStart;
	}
	public String getinsuranceNum(){
		return insuranceNum;
	}
}
