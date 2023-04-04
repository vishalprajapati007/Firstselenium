import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Checkboxtest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
