package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputFileRead {
	
	public List<String> inputarray() throws IOException{
		
		
		
		BufferedReader car_in = new BufferedReader(new FileReader(".\\src\\test\\resources\\input\\car_input.txt"));

		String pattern = "[A-Z][A-Z][0-9][0-9]";
        Pattern p = Pattern.compile(pattern);
		List <String> inputRecArray = new ArrayList<String>();
		String st;
		while ((st = car_in.readLine()) != null) {
			  
	        Matcher m = p.matcher(st);
	        while (m.find()) {
	    	String reg = st.substring(m.start(0), m.end(0)+4);
	    	inputRecArray.add(reg);
	        }
		}
		car_in.close();

		return(inputRecArray);
	}
}
