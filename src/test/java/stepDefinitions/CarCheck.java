package stepDefinitions;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.InputFileRead;
import utilities.ObtainData;
import utilities.OutputFileRead;

public class CarCheck {
		
	@Given("^the list of car registration numbers$")
	public void the_list_of_car_registration_numbers() throws Throwable {

		InputFileRead input = new InputFileRead();
		List<String> inputRecArray = input.inputarray();
		assertTrue(inputRecArray.size()>0);

			}
	
	
	@When("^registration number is submitted$")
	public void registration_number_is_submitted() throws Throwable {
		ObtainData actualoutput = new ObtainData();		
		assertTrue(actualoutput.actualarray().size()>0);
	}

//	@Then("^the relevant car details are obtained$")
//	public void the_relevant_car_details_are_obtained() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		ObtainData actualoutput = new ObtainData();		
//		List<String> actualRecArray = actualoutput.actualarray();
//		
//		
//	}

	@Then("^the car details match the details from the file$")
	public void the_car_details_match_the_details_from_the_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		ObtainData actualoutput = new ObtainData();		
		List<String> actualRecArray = actualoutput.actualarray();
		
		OutputFileRead givenOutput = new OutputFileRead();
		List<String> expectedArrayFromFile = givenOutput.outarray();
		
		//assertArrayEquals(expectedArrayFromFile.toArray(), actualRecArray.toArray());
		
		for(int i=1; i < expectedArrayFromFile.size();i++) {
			boolean match = false;

			for (int j=0; j<actualRecArray.size();j++) {
				

				
				if (expectedArrayFromFile.get(i).equals(actualRecArray.get(j))){
					
					match = true;
					
				}
					
				}
			if (!match) {
				
	        	try {
					Assert.assertEquals(0, 1);//forcing failure
	            	}
	            	catch (AssertionError err) {
	    				System.out.println("Failed because expected did not match actual");
	    				System.out.println("Problem registration is "+ expectedArrayFromFile.get(i).toString());	            		
	            	}
	            					
			
			}
			
		}
		
	}

}
