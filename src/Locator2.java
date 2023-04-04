import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
//  	WebDriver driver = new FirefoxDriver();
//		
//		WebDriver driver = new EdgeDriver();
		
		String name= "Vishal";		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		 
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext= driver.findElement(By.cssSelector("Form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = passwordtext.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
		
		
		
	}
	}


