package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	
	public static void Alerts() throws InterruptedException {
		
		
		String text="Dhanush";
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);

		driver.findElement(By.id("name")).sendKeys(text);
		
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		Thread.sleep(1000);

		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(1000);

		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);

		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(1000);

		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(1000);

		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
	}
	
	


}
