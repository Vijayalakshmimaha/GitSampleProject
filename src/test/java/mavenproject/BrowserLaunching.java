package mavenproject;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver; 

public class BrowserLaunching {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	String title=	driver.getTitle();
	System.out.println(title);
	String urlofweb= driver.getCurrentUrl();
	System.out.println(urlofweb);
	String wid=driver.getWindowHandle();
	System.out.println(wid);
	Set<String> allwid=driver.getWindowHandles();
	for(String x: allwid)
	{
		System.out.println(x);
	}
	String srccode=driver.getPageSource();
	System.out.println(srccode);
	Thread.sleep(2000);
	
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
