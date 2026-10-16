package extraClasses;

import weather.WeatherData;

public class weatherReading {
	public static void main(String[] args) {

		String[] weatherData = WeatherData.getData();
		
		for (int index = 1; index < weatherData.length; index++) {
					
				
			String line = weatherData[index];
				
				
			String[] elements = line.split(",");

					
			String year = elements[4];
			String month = elements[5];
			String day = elements[6];
			String hour = elements[7];
			String windSpeed = elements[8];
			String temperature = elements[9];

			
			
			String str = "";
			str += year + " ";
			str += month + " ";
			str += day + " ";
			str += hour + " ";
			str += temperature;
			str += windSpeed; 
			System.out.println(str);
				
			}
		}
	}

String[] weatherData = WeatherData.getData();

for (int index = 1; index < weatherData.length; index++) {
	
	
	String line = weatherData[index];
		
		
	String[] elements = line.split(",");

			
	String siteId = elements[0];
	String siteName = elements[2];
	String temperature = elements[3];
	String year = elements[4];
	String month = elements[5];
	String date = elements[6];
	String hourTempRecorded = elements[7];

}
	
	double minTemp = Double.MAX_VALUE;
	int index1 = 0;
	String[] weatherforreal = weatherData[index1].split(",");
	int siteID = Integer.parseInt(weatherforreal[0]);
	int temperature = Integer.parseInt(weatherforreal[9]);
	if(siteID == 3063) {
		if(temperature < minTemp) {
			minTemp = temperature;
		}
			
	}
	System.out.println(minTemp);
	
	

}

}
