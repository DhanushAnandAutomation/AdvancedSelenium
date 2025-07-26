package seleniumLearning;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eCommerce {
	
	public static void AmazonInterview() throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		String[] itemsToBuy = {"Walnuts","Cucumber"};
		
		int j=0;
		
		
		Thread.sleep(3000);
		
		List <WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		
		
		
		for (int i=0;i<products.size();i++) {
			
			
			String[] name=products.get(i).getText().split("-");

			String formattedName=name[0].trim();
			
			List<String> itemsToBuyList = Arrays.asList(itemsToBuy);
			
			if (itemsToBuyList.contains(formattedName)) {
				
				
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
				
				/*
				 * new Actions(driver) .scrollToElement(driver.findElements(By.xpath(
				 * "//div[@class='product-action']/button")).get(i)).perform();
				 */
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				Thread.sleep(3000);
				
				
				
				j++;
				
				if(j==itemsToBuy.length) {
					
					break;
				}
				
			}
			
			
			
		}
		
		
		driver.quit();
	}

}
