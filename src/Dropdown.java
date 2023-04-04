import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
						
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		
		

	}

}
