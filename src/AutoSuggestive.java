import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

		public static void main(String[] args) throws InterruptedException {

			// TODO Auto-generated method stub



			ChromeOptions option = new ChromeOptions();
			
			option.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(option);
			
			driver.manage().window().maximize();

			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

			driver.findElement(By.id("autosuggest")).sendKeys("ind");

			Thread.sleep(3000);

			List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

			for(WebElement option1 :options)

			{

			if(option1.getText().equalsIgnoreCase("India"))

			{

			option1.click();

			break;

			}

			}

			}

	}


