package seleniumLearning;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestingDropDown {

	public static void AutoSugDropDown(String URL) throws InterruptedException  {

		ChromeDriver driver= new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);

		//List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));


		for(WebElement option :options)

		{

			if(option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;


			}

		}


		driver.quit();

	}



}