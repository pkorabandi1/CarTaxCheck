package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObtainData {
	
	
	public List<String> actualarray() throws InterruptedException, IOException {
		
		InputFileRead input = new InputFileRead();
		List<String> inputRecArray = input.inputarray();			
		List<String> actualRecordsArray = new ArrayList<String>();

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	for (int i = 0; i<inputRecArray.size(); i++) {
			
			String regNo = inputRecArray.get(i);
			
			driver.get("https://cartaxcheck.co.uk/");
			driver.findElement(By.id("vrm-input")).sendKeys(regNo);
			driver.findElement(By.xpath("//*[@id=\"vehicle-search\"]/button")).click();
        	Thread.sleep(2000);
        	String carreg = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd")).getText();
        	//System.out.println(carreg);
        	
        	String make  = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd")).getText();
        	String model = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd")).getText();
        	String color = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd")).getText();
        	
        	String year = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd")).getText();
        		
        	//Assertion
//        	try {
//        	Assert.assertEquals(regNo.toString(),carreg.toString());
//        	}
//        	catch(AssertionError err) {
//        		System.out.println("Expected is: "+ regNo.toString()+ " Actual is: "+ carreg.toString()  );
//
//        	}
        	
        	String actualRec = carreg+","+make+","+model+","+color+","+year;
        	//System.out.println(actualRec);
        	actualRecordsArray.add(actualRec);
        	
    	}
    	driver.quit();
    	
		return (actualRecordsArray);
		
	}
}
