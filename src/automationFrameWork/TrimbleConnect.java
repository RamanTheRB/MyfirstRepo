package automationFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrimbleConnect {

	public static void main(String[] args) throws InterruptedException 
		
		
	{
			// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
	driver.get("http://app.qa1.gteam.com");
	System.out.println("TrimbleConnect Opened");
	
	
	driver.findElement(By.xpath(".//*[@id='user']")).click();
	
	driver.findElement(By.xpath(".//*[@id='user']")).sendKeys("raman_babu@trimble.com");
	
	driver.findElement(By.xpath(".//*[@id='password']")).click();
	
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("N00zealand$");
	
	driver.findElement(By.xpath(".//*[@id='signin']")).click();
	//driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath(".//*[@id='u_4_2']")).click();
	//driver.findElement(By.xpath("//li[12]/a/span/span")).click();
	}

}
