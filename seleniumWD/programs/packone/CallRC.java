package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class CallRC {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		WebDriverBackedSelenium rc=new WebDriverBackedSelenium(driver, "http://");
		rc.type("id=pass", "abcdef");
		driver.findElement(By.id("day")).sendKeys("24");
		rc.select("id=month", "Apr");
		rc.select("id=year", "2014");
		driver.findElement(By.id("pass")).clear();

	}

}
