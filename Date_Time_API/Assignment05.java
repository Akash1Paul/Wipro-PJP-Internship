package Date_Time_API;

import java.time.LocalTime;

public class Assignment05 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current system time : " + currentTime);
		LocalTime time1 = currentTime.plusHours(25);
		System.out.println("Time After 25 minutes : " + time1);
	}

}
