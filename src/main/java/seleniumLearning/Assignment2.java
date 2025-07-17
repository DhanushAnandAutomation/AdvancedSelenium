package seleniumLearning;

import static org.testng.AssertJUnit.assertTrue;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void AssignmentTwo(String URL) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get(URL);



		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Dhanush");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("d@d.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement GenderDropDown= driver.findElement(By.id("exampleFormControlSelect1"));

		Select select = new Select(GenderDropDown);

		select.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio2")).click();


		driver.findElement(By.name("bday")).sendKeys("01-01-2021");

		driver.findElement(By.xpath("//input[@type='submit']")).click();


		String Result=(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText()); 

		System.out.println(Result);

		assertTrue(Result.contains("Success"));

		Thread.sleep(2000);





		driver.quit();




	}

}
