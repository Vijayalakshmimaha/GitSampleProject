package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Switchtomethods {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String wid=driver.getWindowHandle();
		System.out.println(wid);
		driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        String wid1=driver.getWindowHandle();
        System.out.println(wid1);
		
       // driver.switchTo().window(wid).navigate().refresh();
      String title=  driver.getTitle();
      System.out.println(title);
        Thread.sleep(2000);
        driver.get("https://www.google.com");
        driver.switchTo().activeElement();
        
        
        
        
        
		
		
	}

}
