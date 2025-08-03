package seleniumLearning;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MainMethod {
	
	
	
	
	
	public  static void  main(String Args[]) throws InterruptedException, FileNotFoundException, IOException {
		
		
        
		
		Properties prop = new Properties();

        // Load properties file from classpath
        try (InputStream input = MainMethod.class.getClassLoader().getResourceAsStream("config.properties")) {

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            // load a properties file from input stream
            prop.load(input);

            // Example usage: get properties
            String URL = prop.getProperty("URL");
            System.out.println("URL from properties: " + URL);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
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
        
        //eCommerce.AmazonInterview();
        
        
        //how to use a method which is not static
        //we have to create a constructor and then call it from the object
		/*
		 * ImplicitExplicitwaits wait= new ImplicitExplicitwaits(); wait.waits();
		 */
        
        //Assignment3.assignment3();
        
        Actions.Actions1();
        
        
        
       
		
	}

}
