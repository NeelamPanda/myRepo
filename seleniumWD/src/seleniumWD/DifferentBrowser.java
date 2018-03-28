package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\Tiki\\seleniumWD\\jars\\chromedriver.exe" );
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "D:\\Tiki\\seleniumWD\\jars\\IEDriverServer.exe")	;	
		WebDriver driver =new InternetExplorerDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("neelam");
		driver.findElement(By.id("pass")).sendKeys("abn,");
		driver.findElement(By.id("u_0_g")).sendKeys("hello");
		driver.findElement(By.id("day")).sendKeys("4");
		driver.findElement(By.id("u_0_6")).click();
		
		
	}

}
