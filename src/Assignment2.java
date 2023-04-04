import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");		
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("name")).sendKeys("meet");
		
		driver.findElement(By.name("email")).sendKeys("Abc@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement Statice = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown = new Select(Statice);
		
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("04/03/2023");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
	    System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
		

	}

}
