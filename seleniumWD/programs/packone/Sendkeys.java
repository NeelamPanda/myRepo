package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		
		// Creating Webelement for Button
		WebElement button=driver.findElement(By.id("u_0_0"));
		// Applying double click on button
		a.doubleClick(button).build().perform();
		
		// Creating Webelement for Email
		WebElement uid=driver.findElement(By.id("email"));
		// Applying Draganddrop
		a.dragAndDrop(button, uid).build().perform();
		
		a.clickAndHold(button).build().perform();
		a.release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
