package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BO {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\WD930\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		By uid=By.id("email");
		driver.findElement(uid).sendKeys("abcdef");
		driver.findElement(By.id("pass")).sendKeys("abcdef");
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("pass")).clear();
		

	}

}
