package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {
	static	Student data[] = new Student[10];
	static{
		for (int i = 0; i <data.length; i++)  	data [i] = new Student ();  	
		
		data [0] = new Student ("Sekar", new int [] {85,75,95});
		data [1] = new Student(null, new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("Manoj", null);
	}

public static void main(String a[] ) {
		StudentService studentService = new StudentService ();
		StudentReport studentReport = new StudentReport ();
		System.out.println ("Grades Calculation: ");
		String x = " ";
		for(int i=0;i<data.length;i++) {
		try {
			x = studentReport.validate (data [i]);
			} 
			catch (NullNameException e) {
				e.printStackTrace();
			} 
			catch (NullMarksArrayException e) {
				e.printStackTrace();
			}
			catch (NullStudentObjectException e) { 
			e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		try {
		System.out.println("Grade : "+studentReport.findGrade(data[i]));
		}
		catch(Exception e) {};
		}
		//TC7
		System.out.println ("Number of Objects with Marks array as null =" + studentService.findNumberOfNullMarksArray(data));
		//TC8
		System.out.println ("Number of Objects with Name as null="+ studentService.findNumberOfNullName(data));	
		//TC9
		System.out.println ("Number of Objects that are entirely null="	+ studentService.findNumberOfNullObjects(data));
			
}
}