package junitt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;
public class Junit_App {	
	public static WebDriver driver;	
	@Before
	public void launchApp(){
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();}
	@After
	public void closeApp(){
		driver.close();	}	
	@Test
	public void test1(){
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(true, a);
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);	}
	@Test
	public void test2() throws Exception{
		driver.findElement(By.id("pass")).sendKeys("abcdef");
		List<WebElement> lc=driver.findElements(By.tagName("a"));
		Assert.assertEquals(50, lc.size());
		Thread.sleep(10000);
		driver.findElement(By.id("year")).sendKeys("1982");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
