package extraClasses;

import weather.WeatherData;

public class weatherStation {
		public static void main(String[] args) {
		
	String[] weatherData = WeatherData.getData();
		
	for (int index = 1; index < weatherData.length; index++) {
				
			
		String line = weatherData[index];
			
			
		String[] elements = line.split(",");

				
		String siteid = elements[0];
		String name = elements[1];

				
		String latString = elements[2];
		String lonString = elements[3];
		String year = elements[4];

				
		double lat = Double.parseDouble(latString);
		double lon = Double.parseDouble(lonString);
			
				
		String str = "";
		str += siteid + " ";
		str += name + " ";
		str += lat + " ";
		str += lon + " ";
		str += year;
		System.out.println(str);
			
		}
	}
}

