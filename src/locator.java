import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	ChromeOptions option = new ChromeOptions();
		
	
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("Vishal");
		driver.findElement(By.name("inputPassword")).sendKeys("Test123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Demo");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("demo@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9586342578");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("Form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Vishal");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector(".submit")).click();
		
		}

}
