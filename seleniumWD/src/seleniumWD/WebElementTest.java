package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {
	public static WebElement wb;
	public static void method(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
	 
		   wb=driver.findElement(By.id("email"));
		   wb.sendKeys("neelam");
		   driver.findElement(By.id("pass")).sendKeys("");
		   wb = driver.findElement(By.id("u_0_5"));
		   if(wb.isEnabled()){
			   wb.click();
		   }
		   
	
	}
	public static void main(String[] args) {
		
		method();
	}

}
