import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
        WebDriver driver = new ChromeDriver(option);
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        ////header/div/button[1]/following-sibling::button[1]
        
       System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
       
       System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div//button[2]")).getText());
        
      
	}

}
