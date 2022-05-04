package Date_Time_API;

import java.time.LocalDate;

public class Assignment01 {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today Date : " + todayDate);
		System.out.println("The Date After Ten Days : " + todayDate.plusDays(10));

	}

}
