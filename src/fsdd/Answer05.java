package fsdd;

import weather.WeatherData;

/**
 * QUESTION 05
 * 
 * If you decide to answer question 05 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer05 {
	public static void main(String[] args) {
		System.out.println("Question 05");
		/*
		 * Add your code below
		 */
		
		String[] data = WeatherData.getData();

		
		double maxLat = -9999;
		String bestId = "";
		String bestName = "";
		double bestLon = 0;
		
		
		for (int i = 1; i < data.length; i++) {
			
			String line = data[i];
			String[] parts = line.split(",");
			
			int siteId = Integer.parseInt(parts[0]);
			String siteName = parts [1];
			double lat = Double.parseDouble(parts[2]);
			double lon = Double.parseDouble(parts[3]);
			
			
			if (lat > maxLat) {
				maxLat = lat;
				bestId = parts[0];
				bestName = parts[1];
				bestLon = lon;
				
			}
		}
		
		
	
		System.out.println("Most Northerly Station:");
		System.out.println("ID: " + bestId);
		System.out.println("Name: " + bestName);
		
		System.out.println("Latitude: " + maxLat);
		
		System.out.println("Longitude: " + bestLon);
	
		}
	}	

