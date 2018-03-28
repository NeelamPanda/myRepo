package testNggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*POM p=new POM();
		driver.findElement(p.uid).sendKeys("abcdef");
		driver.findElement(p.pwd).sendKeys("xyz123");*/
		
		// Creating Page Factory Object
		POM p=PageFactory.initElements(driver, POM.class);
		p.uid.sendKeys("abcdef");
		p.pwd.sendKeys("xyz123");
		p.day.sendKeys("24");
		
		
		
		
		
		
		
		
		
		
		

	}

}
