package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//aa
public class DynamicDropDowns {
	
	public static void BasicDynamicDropDown(String URL) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		//this is an example for xpath with parent-child tag connection
		driver.findElement(By.xpath("//li/a[@value='BLR']")).click();
		
	//	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		Thread.sleep(2000);
		
		
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
		
		
	}

}
