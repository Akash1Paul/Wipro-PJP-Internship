package com.wipro.main;
import java.util.Scanner;
import com.wipro.bean.*;
import com.wipro.service.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeBean eb1=new EmployeeBean(1001,"Sunny",35000,"Project Engineer");
        EmployeeBean eb2=new EmployeeBean(1002,"Vikash",40000,"System Engineer");
        EmployeeBean eb3=new EmployeeBean(1003,"Shubham",45000,"Senior Engineer");
        EmployeeBean eb4=new EmployeeBean(1004,"Shashank",65000,"Associate Engineer");
        EmployeeBean eb5=new EmployeeBean(1005,"Vishal",25000,"Junior Engineer");
        
        EmployeeService es = new EmployeeService();
        System.out.println(es.insertEmployee(eb1));
        System.out.println(es.insertEmployee(eb2));
        System.out.println(es.insertEmployee(eb3));
        System.out.println(es.insertEmployeeByPosition(eb4, 1));
        System.out.println(es.insertEmployeeByPosition(eb5, 200));
        
        es.fetchAllEmployee();
        for(EmployeeBean emp:es.fetchAllEmployee()) {
        	System.out.println(emp.toString());
        }
        System.out.println();
        
        es.deleteEmployeeByEmpID(1003);
        
        for(EmployeeBean emp : es.fetchAllEmployee()) {
        	System.out.println(emp.toString());
        }
        System.out.println();
        
        es.updateEmployeeByEmpID(1004);
        
        for(EmployeeBean emp : es.fetchAllEmployee()) {
        	System.out.println(emp.toString());
        }
        es.findEmployeeByEmpID(1001);
        sc.close();
	}
}
