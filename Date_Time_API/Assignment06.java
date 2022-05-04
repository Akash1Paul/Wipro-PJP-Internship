package Date_Time_API;

import java.time.LocalTime;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current system time : " + currentTime);
		LocalTime time1 = currentTime.minusHours(5).minusMinutes(30);
		System.out.println("Time Before 5 hours 30 minutes : " + time1);
	}

}
