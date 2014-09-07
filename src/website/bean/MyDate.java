package website.bean;

import java.util.Calendar;
import java.util.TimeZone;

public class MyDate {

	private String currentDate;
	private Calendar cal;
	
	public MyDate()
	{		
		cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
		currentDate = getDay() + " " + getMonth() + " " + cal.get(Calendar.DATE)
					  + ", " + cal.get(Calendar.YEAR);
	}
	
	public String getCurrentDate() {
		
		
		return currentDate;
	}
	
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	public String getDay()
	{
		String result = "";
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day)
		{
			case Calendar.MONDAY: 
				result = "Monday";
				break;
			case Calendar.TUESDAY: 
				result = "Tuesday";
				break;
			case Calendar.WEDNESDAY:
				result = "Wednesday";
				break;
			case Calendar.THURSDAY: 
				result = "Thursday";
				break;
			case Calendar.FRIDAY: 
				result = "Friday";
				break;
			case Calendar.SATURDAY: 
				result = "Saturday";
				break;
			case Calendar.SUNDAY: 
				result = "Sunday";
				break;
			default:
				break;
		}
		
		return result;
	}
	
	public String getMonth()
	{
		String result = "";
		int day = cal.get(Calendar.MONTH);
		switch (day)
		{
			case 0: 
				result = "January";
				break;
			case 1: 
				result = "February";
				break;
			case 2:
				result = "March";
				break;
			case 3: 
				result = "April";
				break;
			case 4: 
				result = "May";
				break;
			case 5: 
				result = "June";
				break;
			case 6: 
				result = "July";
				break;
			case 7: 
				result = "August";
				break;
			case 8: 
				result = "September";
				break;
			case 9: 
				result = "October";
				break;
			case 10: 
				result = "November";
				break;
			case 11: 
				result = "December";
				break;
			default:
				break;
		}
		
		return result;
	}
}
