package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Clicking on Go button
		driver.findElement(By.name("proceed")).click();
		// Switch to Alert Message
		Alert a=driver.switchTo().alert();
		// Reading text from alert
		System.out.println(a.getText());
		// Closing Alert Message
		a.dismiss();
		a.accept();
		 



	}

}
