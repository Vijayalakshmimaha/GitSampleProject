package firstbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBy {
	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement first=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("gayathri");
		String firstatt=first.getAttribute("placeholder");
		System.out.println(firstatt);
		Thread.sleep(2000);
		WebElement last=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("ragu");
		
		WebElement fem=driver.findElement(By.xpath("//input[@value='FeMale']"));
		fem.click();
		String femtag=fem.getTagName();
		System.out.println(femtag);
		Thread.sleep(2000);
	WebElement check=	driver.findElement(By.id("checkbox1"));
	check.click();
	Thread.sleep(2000);
	WebElement subbtn=driver.findElement(By.xpath("//button[@name='signup']"));
	String subtagtext=subbtn.getText();
	System.out.println(subtagtext);
	//subbtn.click();
	
	Thread.sleep(2000);
	driver.quit();
		
		
	}

}
