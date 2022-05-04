package com.mile1.test;

import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class Test {

	@org.junit.Test
	public void test() throws  NullMarksArrayException, NullStudentObjectException {
		String[] exop= {"A","A","A+","A+","F","F","F","F"};
		StudentReport sr=new StudentReport();
		Student s[]=new Student[10];
		String in[]=new String[10];
		s[0]=new Student("A1",new int[] {72,73,74});
		s[1]=new Student("B1",new int[] {75,76,77});
		s[2]=new Student("C1",new int[] {99,99,99});
		s[3]=new Student("C3",new int[] {100,100,99});
		s[4]=new Student("B2",new int[] {13,88,13});
		s[5]=new Student("C3",new int[] {14,14,99});
		s[6]=new Student("A2",new int[] {77,55,12});
		s[7]=new Student(null,new int[] {13,88,13});
		s[8]=new Student("A2",null);
		s[9]=null;
		
		for(int i=0;i<10;i++) {
		try {
			in[i]=sr.findGrade(s[i]);
		}catch(Exception e){
			in[i]=null;
		}
		}

		
		List<String> values = new ArrayList<String>();
	      for(String data: in) {
	         if(data != null) { 
	            values.add(data);
	         }
	      }
	      String[] target = values.toArray(new String[values.size()]);
		assertArrayEquals(exop, target);
	}
}