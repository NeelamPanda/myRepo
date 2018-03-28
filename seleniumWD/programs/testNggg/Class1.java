package testNggg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Class1 {
	public static WebDriver driver;
	@Ignore
  @Test
  public void f() {
	  driver.findElement(By.id("email")).sendKeys("Kishore");
	  boolean a=driver.findElement(By.id("pass")).isDisplayed();
	  Assert.assertEquals(a, true);
	  boolean b=driver.findElement(By.id("pass")).isEnabled();
	  Assert.assertEquals(b, true);
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
