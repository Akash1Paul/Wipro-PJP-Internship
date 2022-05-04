package com.wipro.service;
import com.wipro.bean.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	private List<EmployeeBean> listEmp = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public boolean insertEmployee(EmployeeBean bean) {
		boolean x = listEmp.add(bean);
		if(x==false) {
			return false;
		}
		return true;
	}
	public String insertEmployeeByPosition(EmployeeBean bean,int position) {
		if(position>0||position>listEmp.size()) {
			listEmp.add(bean);
			return "Inserted employee at end position ";
		}
		listEmp.add(position, bean);
		return "Inserted employee at position : "+(position+1);
	}
	public List<EmployeeBean> fetchAllEmployee(){
		if(listEmp == null) {
			return null;
		}
		return listEmp;
	}
	public boolean deleteEmployeeByEmpID(int empID) {
		ListIterator<EmployeeBean> li = listEmp.listIterator();
		while(li.hasNext()) {
			if(li.next().getEmpID()==empID) {
				li.remove();
				return true;
			}
		}
		return false;
	}
	public boolean updateEmployeeByEmpID(int empID) {
		EmployeeBean employee = findEmployeeByEmpID(empID);

	    if (employee == null) {
	        return false;
	    }
	        
	    System.out.println("Enter name : ");
	    employee.setName(sc.nextLine());
	    System.out.println("Enter salary : ");
	    // do not mix nextLine and nextFloat!
	    employee.setSalary(Float.parseFloat(sc.nextLine()));
	    System.out.println("Enter designation : ");
	    employee.setDesignation(sc.nextLine());
	                
	    return true; 
	}
	public EmployeeBean findEmployeeByEmpID(int empID) {
		for (EmployeeBean emp : listEmp) {
	        if (emp.getEmpID() == empID) {
	            return emp;
	        }
	    }
	    return null;
	
	}
}

