package Sales;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Salevoucher 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.expandx.in/site/login");
		Thread.sleep(2000);
		System.out.println("Website open");
		driver.findElement(By.xpath("//*[@id='loginform-username']")).sendKeys("fineaccount@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginform-password']")).sendKeys("6KvOl7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button")).click();
		Thread.sleep(4000);
		System.out.println("Login successfully");
	}
}

