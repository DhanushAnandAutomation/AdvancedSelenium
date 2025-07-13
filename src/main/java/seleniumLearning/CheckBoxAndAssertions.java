package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAndAssertions {
	
	public static void checkbox(String URL) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(URL);
		
		
		//there are two assertions called assertTrue and assertFalse. If we are running assertTrue and output is true, test suite continues, but if false, test fails there. same for assertFalse but vice versa
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		
	}

}
