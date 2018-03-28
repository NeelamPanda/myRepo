package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableMethod {
	
	public WebDriver driver;
	public void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void closeApp(){
		driver.close();
	}
	
	public void elementPresent(String loc, boolean exp){
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
			System.out.println("pass");
		else
			System.out.println("fail");
		}
	public void elementEnabled(String loc,boolean exp){
		boolean isEnabled=driver.findElement(By.id(loc)).isEnabled();
		if(isEnabled==exp)
			System.out.println("pass");
		else
			System.out.println("fail");

		
	}


}
