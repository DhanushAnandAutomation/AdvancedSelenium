package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
	
	public static void assigment1(String assigmentURL1) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(assigmentURL1);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		//test fails if checkbox not ticked
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		//test fails if checkbox remained ticked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));
		
		System.out.println("total number of checkboxes = " + checkboxes.size());
		
		
		
	}

}
