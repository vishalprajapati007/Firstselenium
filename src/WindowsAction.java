import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsAction {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}
