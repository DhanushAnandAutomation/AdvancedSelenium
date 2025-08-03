package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	
	public static void assignment3() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(3000);
		
		
		
		
		 WebElement Dropdown= driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		
		 Select se= new Select(Dropdown);
		 
		 se.selectByContainsVisibleText("Consultant");
		
			/*
			 * driver.findElement(By.xpath("//label[@for='terms'] //span[@type='checkbox']")
			 * ).click();
			 */
		 
		 driver.findElement(By.id("signInBtn")).click();
		 
			/* driver.switchTo().alert().dismiss(); */
		 
		 
		 System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']"))).getText());
		 
		 
		Thread.sleep(3000);
		
		List <WebElement> PhoneTable= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for (WebElement Phones : PhoneTable) {
            
			System.out.println(Phones.getText());
        }
		
		
		for(int i=0;i<PhoneTable.size();i++) {
			
			
			PhoneTable.get(i).click();
			
			
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		
		
	}

}
