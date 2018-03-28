package testNggg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class2 {
	public static WebDriver driver;
	  @Test
	  public void f1() {
		  driver.findElement(By.id("email")).sendKeys("Kishore");
		 List<WebElement> lc=driver.findElements(By.tagName("a"));
		 SoftAssert s=new SoftAssert();
		 s.assertEquals(lc.size(), 50);
		 //Assert.assertEquals(lc.size(), 50);
		 driver.findElement(By.id("pass")).sendKeys("abcdef");
		 System.out.println(driver.getTitle());
		 s.assertAll();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=new FirefoxDriver();
		  driver.get("http://facebook.com");
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
