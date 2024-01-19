package mavenproject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managewindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Maven\\src\\test\\resources\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//capturing the size of myntra
	Dimension sizemyn=	driver.manage().window().getSize();
	int mynheight=sizemyn.getHeight();
	System.out.println(mynheight);
	int mynwidth=sizemyn.getWidth();
	System.out.println(mynwidth);
	//capturing the position of myntra
Point pos=	driver.manage().window().getPosition();
int x=pos.getX();
int y=pos.getY();
System.out.println(x);
System.out.println(y);
//set size for myntra
Thread.sleep(2000);
Dimension newsize= new Dimension(200,200);
driver.manage().window().setSize(newsize);
Thread.sleep(2000);
Point newpos=new Point(300,200);
driver.manage().window().setPosition(newpos);
Thread.sleep(2000);
driver.quit();





	
	
	
	
	}

}
