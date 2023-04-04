import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		ChromeOptions option = new ChromeOptions();
		//comment
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		
		WebElement closebutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		
		closebutton.click();
		
		Thread.sleep(3000);
		driver.quit();
		//driver.close();

	}

}
