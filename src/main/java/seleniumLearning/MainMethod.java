package seleniumLearning;


import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MainMethod {
	
	
	
	
	
	public  static void  main(String Args[]) throws InterruptedException, FileNotFoundException, IOException {
		
		Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/config.properties"));
		
        String URL = prop.getProperty("URL");	
		//System.out.println(URL);
		
        String assigmentURL1 = prop.getProperty("assigmentURL1");
        
        String assignmentURL2 = prop.getProperty("assigmentURL2");
        
		//StaticDropDown.StaticDropDown1(URL);
		
		//PassengerDropDown.passengerDropDown1(URL);
		
		//DynamicDropDowns.BasicDynamicDropDown(URL);
		
		//AutoSuggestingDropDown.AutoSugDropDown(URL);
		
		//CheckBoxAndAssertions.checkbox(URL);
		
		//Assignment1.assigment1(assigmentURL1);
        
        //Assignment2.AssignmentTwo(assignmentURL2);

        //EndToEndFlightBooking.FlightBooking(URL);
        
		/* Alerts.Alerts(); */
        
        eCommerce.AmazonInterview();
		
	}

}
