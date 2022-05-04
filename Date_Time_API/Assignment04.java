package Date_Time_API;

import java.time.LocalDate;

public class Assignment04 {

	public static void main(String[] args) {
		LocalDate  date  = LocalDate.now();
		if(date.isLeapYear())
			System.out.println("Current Year is a leap Year");
		else
			System.out.println("Current Year is not a leap Year");
	}

}
