package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demo.actitime.com/");
	
	//search.click();
	
}
}
