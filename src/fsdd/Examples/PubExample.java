package fsdd.Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

public class PubExample {

	public static void main(String[] args) {
		// A list of coordinates that will be displayed on a map
		ArrayList<Coordinate> coordinates = new ArrayList<>();

		// A try catch block is needed to catch any file input errors
		try {

			// We use a Buffered Reader to read the file line by line
			BufferedReader reader = new BufferedReader(new FileReader(new File("data/EdPub.csv")));

			String line;
			int count = 0;

			// continue reading until null is returned when the end of the file has been
			// reached
			while ((line = reader.readLine()) != null) {
				count++;
				// skip header row
				if (count == 1) {
					continue;
				}
				// printing every line is computationally expensive
//						System.out.println(line);

				// we can use the split method of String to extract the individual fields from
				// the comma delimited line to an array
				String[] data = line.split(",");

				// The Pub csv format is
				// id, name, address, postcode, Lat, Lon
				// fields 4 and 5 hold the latitude and longitude which need converted to type
				// double
				// create a new Coordinate and add it to a list of coordinates
				Coordinate coordinate = new Coordinate(Double.parseDouble(data[4]), Double.parseDouble(data[5]));
				coordinates.add(coordinate);
			}

			reader.close();

			// show the list of coordinates
			gui.MapGui.showMap(coordinates);
			System.out.println(coordinates.size());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
