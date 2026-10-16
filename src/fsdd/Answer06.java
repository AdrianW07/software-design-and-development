package fsdd;

import weather.WeatherData;

/**
 * QUESTION 06
 * 
 * If you decide to answer question 06 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer06 {
	private static String line;


	public static void main(String[] args) {
		System.out.println("Question 06");
		/*
		 * Add your code below
		 */
		
		String[] weatherData = WeatherData.getData();
		
	}


	private static void fewestReadings() {
			
	String[] weatherData = weatherData.getData();
	
	for (int i = 1; i < weatherData; i++) (
			
			String line = weatherData[i];
		
			String[] elements = line.split(",");

			
		String id = elements[0];
		String name = elements[1];

		
		String latString = elements[2];
		String lonString = elements[3];

			
		double lat = Double.parseDouble(latString);
		double lon = Double.parseDouble(lonString);

			
			
		
		
	
	
		

	
	
	
	
	
		}
	}	


	
