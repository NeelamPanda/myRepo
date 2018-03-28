package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTset {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//Absolute Xpath--start from root node
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("hello");
		//Relative Xpath-
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("hhgdf");
		
		//preceding concept
		
		
		driver.findElement(By.xpath(".//*[@id='js_0']/table/tbody/tr[2]/td[7]/a")).click();
		
		
		
		
	}

}
