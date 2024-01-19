package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserLaunching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		//upcasting
		//webdriver interface
		// driver ---object reference variable
		//new --->to create object
		// Edgedriver ---class
		driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
		
	String webpagetitle=	driver.getTitle();
	System.out.println(webpagetitle);
	String webpageurl=driver.getCurrentUrl();
	System.out.println(webpageurl);
	//String page=driver.getPageSource();
	//System.out.println(page);
	driver.navigate().to("https://www.myntra.com/shop/kids");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	
	String wid=driver.getWindowHandle();
	System.out.println(wid);
Set<String> allwid=driver.getWindowHandles();
int count=allwid.size();
System.out.println(count);
Thread.sleep(2000);
driver.quit();

	}

}
