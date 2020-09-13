import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Sortlist {
	public static void main(String[] args) {
		String path = "C:\\Users\\13476\\Desktop\\Fall 2020\\CISC 3160\\CISC-3160\\CISC-3160\\Lab2\\Weekly chart.csv";    //string variable path thats equal to the CSV file
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));			//make a buffer reader object to read the CSV file	
			String line = "";
			int iteration = 0;								
			while((line = br.readLine())!=null) {            //if the line isn't null read line 
				if(iteration == 0) {						// skip the first line of CSV
			        iteration++;  
			        continue;
			    }
				String[] values = line.split(",");		//a string array called values and split the line by comma
				
				System.out.println("Artist: " + values[2]+ "  Streams: " + values[3]);		//print a list with artist name and weekly streams by column 
				
			}
			br.close();
		} 
		catch (FileNotFoundException e) {             //error message when file not found
			e.printStackTrace();
		} catch (IOException e) {					//error message if something goes wrong with readLine
			e.printStackTrace();
		}
		
		
	}
}
