import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticeDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement Statice =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(Statice);
	    dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());	
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
//		driver.close();
	}

}
