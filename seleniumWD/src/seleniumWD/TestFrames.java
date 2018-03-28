package seleniumWD;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		ArrayList a=new ArrayList(driver.findElements(By.tagName("frame")));
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++){
			List<WebElement> lc=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println(lc.size());
			driver.switchTo().parentFrame();
			Thread.sleep(3000);
			
		}
		
		
		
		
		
		
		 
		
		
	}

}
