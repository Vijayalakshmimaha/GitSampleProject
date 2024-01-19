package firstbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idmethod {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailtext=driver.findElement(By.id("email"));
		emailtext.sendKeys("admin123@gmail.com");
		Thread.sleep(2000);
		emailtext.clear();
		WebElement pwdtext=driver.findElement(By.name("pass"));
		pwdtext.sendKeys("987654321");
		Thread.sleep(2000);
		pwdtext.clear();
		//WebElement logbtn=driver.findElement(By.name("login"));
		//logbtn.click();
		
		
		
				
			
		
				
	}

}
