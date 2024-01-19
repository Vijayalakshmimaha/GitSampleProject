package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.myntra.com/shop/men");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.myntra.com/shop/women");
         Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
