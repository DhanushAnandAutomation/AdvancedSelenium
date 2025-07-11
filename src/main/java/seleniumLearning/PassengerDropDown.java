package seleniumLearning;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public  class PassengerDropDown {
	
	
	public static void passengerDropDown1(String URL) throws InterruptedException{
	
	ChromeDriver driver= new ChromeDriver();	
	
	driver.get(URL);
	
	driver.findElement(By.id("divpaxinfo")).click();




	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	Thread.sleep(4000);

	for(int i=1;i<5;i++)

	{

	driver.findElement(By.id("hrefIncAdt")).click();
	Thread.sleep(1000);

	}


	driver.findElement(By.id("btnclosepaxoption")).click();

	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	driver.quit();

}
}