package fsdd;

import weather.WeatherData;

/**
 * QUESTION 02
 * 
 * If you decide to answer question 02 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */

public class Answer02 {
    public static void main(String[] args) {
        System.out.println("Question 02");

        
        String[] rows = WeatherData.getData();

        double lowestTemp = Double.MAX_VALUE;
        String foundID = "";
        String foundName = "";
        int y = 0, m = 0, d = 0, h = 0;

         
        for (int i = 1; i < rows.length; i++) {
            String line = rows[i];
            String[] values = line.split(",");

            String id = values[0];

           
            if (!id.equals("3063")) {
                continue;
            }

            
            double temp = Double.parseDouble(values[9]);  

           
            if (temp < lowestTemp) {
                lowestTemp = temp;
                foundID = id;
                foundName = values[1];  

                
                y = Integer.parseInt(values[4]);  
                m = Integer.parseInt(values[5]);  
                d = Integer.parseInt(values[6]);  
                h = Integer.parseInt(values[7]);   
            }
        }

        
        System.out.println("Site ID: " + foundID);
        System.out.println("Site Name: " + foundName);
        System.out.println("Temperature: " + lowestTemp);
        System.out.println("Year: " + y);
        System.out.println("Month: " + m);
        System.out.println("Date: " + d);
        System.out.println("Hour: " + h);
    }
}
