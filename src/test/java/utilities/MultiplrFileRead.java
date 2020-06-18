package utilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiplrFileRead {
    public static void main(String[] args) throws IOException {
    	
		String pattern = "[A-Z][A-Z][0-9][0-9]";
        Pattern p = Pattern.compile(pattern);
		List <String> inputRecArray = new ArrayList<String>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
            File folder = new File("./src/test/resources/input/");
            if (folder.isDirectory()) {
                for (File file : folder.listFiles()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line = null;
                    int lineCount = 0;

                    while ((line = bufferedReader.readLine() ) !=null) {
                        lineCount++;
                        if (3 != lineCount) {
                	        Matcher m = p.matcher(line);
                	        while (m.find()) {
                	    	String reg = line.substring(m.start(0), m.end(0)+4);
                	    	inputRecArray.add(reg);

                	        }
                        }
                    }
                }
                System.out.println(inputRecArray);
            }
        
    }
}
