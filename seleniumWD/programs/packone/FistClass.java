package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FistClass {
	public static void main(String[] args) {		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		driver.close();

	}

}
