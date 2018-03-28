package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		// Applying Implicit Wait
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Applying WebdriverWait
		WebDriverWait w=new WebDriverWait(driver, 60);
		driver.findElement(By.id("email")).sendKeys("Kishore");
		w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 100));
		driver.findElement(By.id("pass")).sendKeys("abcdef");
		// Clicking on Forgotten Account link
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a")).click();
		w.until(ExpectedConditions.titleContains("Forgotten"));
		w.until(ExpectedConditions.urlContains(".com"));
		// Entering Value in a text box
		driver.findElement(By.id("identify_email")).sendKeys("abcdefgh");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
