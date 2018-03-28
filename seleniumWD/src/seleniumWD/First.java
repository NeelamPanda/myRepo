package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class First {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("neelam");
		//Using RC command into webdriver
		WebDriverBackedSelenium uid=new WebDriverBackedSelenium(driver,"http://");
		uid.type("id=pass", "abcdef");
		uid.select("id=day", "23");
		
		
		}

}
