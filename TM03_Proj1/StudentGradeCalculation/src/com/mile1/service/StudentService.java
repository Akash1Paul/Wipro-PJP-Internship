package com.mile1.service;
import com.mile1.bean.Student;
public class StudentService {
	public int findNumberOfNullMarksArray(Student s[]) {
		int C = 0;
		
			for (int i = 0; i < s.length; i++) {
				try {
					s[i].getMarks();
				} 	catch (Exception e) {
					C++;
				}
			}
		
		return C;
	}
	public int findNumberOfNullName(Student s[]) {
		int C1 = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) C1++;;
		}
		
		return C1;
	}
	public int findNumberOfNullObjects(Student s[]) {
		int C2 = 0;
		
		for (int i = 0; i < s.length; i++) {
			try {
				s[i].getName();
			} catch (Exception e) {
				C2++;
			}
		}
		
		return C2;
	}
}
