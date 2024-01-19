package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprogramms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement first=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("gayathri");
		String attfirst=first.getAttribute("placeholder");
		System.out.println(attfirst);
		Thread.sleep(2000);
		WebElement last= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("raguvaran");
		String taglast=last.getTagName();
		System.out.println(taglast);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
		gender.click();
		Thread.sleep(2000);
		
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
	checkbox.click();
	Thread.sleep(2000);
	WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
	String subtext=sub.getText();
	System.out.println(subtext);
		

	}

}
