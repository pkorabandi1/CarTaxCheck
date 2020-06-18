package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class OutputFileRead {
	
	
	public List<String> outarray() throws IOException{
		
		BufferedReader car_out = new BufferedReader(new FileReader(".\\src\\test\\resources\\car_output.txt"));


		List <String> outputRecArray = new ArrayList<String>();
		String st;
		while ((st = car_out.readLine()) != null) {
			
	    	outputRecArray.add(st);
	        }
		car_out.close();

		return(outputRecArray);
}
}

	
	

