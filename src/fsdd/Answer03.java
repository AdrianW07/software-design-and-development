package fsdd;

import weather.WeatherData;

/**
 * QUESTION 03
 * 
 * If you decide to answer question 03 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer03 {
	public static void main(String[] args) {
		System.out.println("Question 03");
		/*
		 * Add your code below
		 */
		
		String[] data = WeatherData.getData();
		
		double totalTemp = 0;
		int count = 0;
		
		
			for (int i = 1; i < data.length; i++) {
				
			String line = data[i];
			String[] parts = line.split(",");
			
			int siteId = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[5]);
			double temp = Double.parseDouble(parts[9]);
			
			if (siteId == 3063 && month == 1) {
				totalTemp += temp; 
				count++;
				
			}
		}
		
		
		double meanTemp = totalTemp / count;
		
		System.out.println("january readings for station 3063: " + count);
		System.out.println("Mean January temperature: " + meanTemp);
		
		
	}	
}
