package Date_Time_API;

import java.time.LocalDate;
import java.time.Period;

public class Assignment03 {

	public static void main(String[] args) {
		LocalDate joiningdate = LocalDate.of(2022, 02, 21);
		Period d = Period.between(joiningdate, LocalDate.now());
		int days = d.getDays();
		int months = d.getMonths();
		int years = d.getYears();
		System.out.println("Experience : " + years + " years " + months + " months " + days + " days." );
	}

}
