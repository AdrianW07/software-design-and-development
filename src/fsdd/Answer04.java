package fsdd;

import java.util.HashSet;

import weather.WeatherData;

/**
 * QUESTION 04
 * 
 * If you decide to answer question 04 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer04 {
	public static void main(String[] args) {
		System.out.println("Question 04");
		/*
		 * Add your code below
		 */
		
		String[] weatherData = WeatherData.getData();
		
		HashSet<String> hotDays = new HashSet<>();
		
		for (int i= 1; i < weatherData.length; i++) {
			
			String line = weatherData[i];
			String[] parts = line.split(",");
			
			double temp = Double.parseDouble(parts[9]);
			
			if (temp >= 21.0) {
				
				String year = parts[4];
				String month = parts[5];
				String day = parts[6];
				
				String dateString = year + "-" + month + "-" + day;
				
				
				hotDays.add(dateString);
				
		}
		
	}
		
		System.out.println("Number of days with temp >=21; " + hotDays.size());
	
	
	}	
}
