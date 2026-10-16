package fsdd;

import weather.WeatherData;

/**
 * QUESTION 01
 * 
 * If you decide to answer question 01 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer01 {
	public static void main(String[] args) {
		System.out.println("Question 01");
		/*
		 * Add your code below
		 */
		String[] weatherData = WeatherData.getData();
		
		int count = 0;
		for(int index =1; index < weatherData.length; index++) {
			
			
			String[] weatherforreal = weatherData[index].split(",");
			int siteID = Integer.parseInt(weatherforreal[0]);
			if(siteID == 3063)  {
				count++;
			}
		}
		System.out.println(count); 

	
	
	
	
	
	}
	

}
