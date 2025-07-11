package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class StaticDropDown {
	
	public static void StaticDropDown1(String URL) throws InterruptedException {
		
		
		
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(URL);
		
		WebElement StaticElement=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown= new Select(StaticElement);
		
		dropdown.selectByIndex(3);
		String text=dropdown.getFirstSelectedOption().getText();
		System.out.println(text);
		Thread.sleep(4000);
		dropdown.selectByVisibleText("AED");
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}

}
