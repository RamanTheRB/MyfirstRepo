package automationFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firsttestcase {

	public static void main(String[] args) throws InterruptedException 
	
	
{
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.facebook.com");
System.out.println("Facebook Opened");


//driver.findElement(By.xpath(".//*[@id='email']")).click();

driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("jananidevi.g@gmail.com");

driver.findElement(By.xpath(".//*[@id='pass']")).click();

driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("hellobuddy1234");

driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
Thread.sleep(1000);
//driver.findElement(By.xpath(".//*[@id='u_4_2']")).click();
driver.findElement(By.xpath("//li[12]/a/span/span")).click();
}

}
