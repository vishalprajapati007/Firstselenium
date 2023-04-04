import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
//		int i=1;
//		while(i<5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//			
//		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// DatePicker
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Enabal");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}

}
