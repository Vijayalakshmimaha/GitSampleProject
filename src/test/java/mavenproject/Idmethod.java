package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idmethod {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("admin");
		WebElement pwds=driver.findElement(By.name("pass"));
		pwds.sendKeys("4321");
		Thread.sleep(3000);
		email.clear();
		WebElement btn=driver.findElement(By.name("login"));
		btn.click();
	Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
