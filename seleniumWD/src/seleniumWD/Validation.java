package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://facebook.com");
		
		driver.navigate().to("http://www.gmail.com");
		driver.manage().window().maximize();
		//driver.navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.navigate().forward();
		driver.findElement(By.id("Email")).sendKeys("tapasjoshi1991@gmail.com");
		WebElement wb_next = driver.findElement(By.id("next"));
		if(wb_next.isEnabled()){
			wb_next.click();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement web_pass = driver.findElement(By.id("Passwd"));
		if(web_pass.isEnabled())
			web_pass.sendKeys("");
		driver.findElement(By.id("signIn")).click();
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		WebElement wb=driver.findElement(By.id("email"));
		WebElement wb1=driver.findElement(By.id("pass"));
		
		wb.sendKeys("neelam");
		//wb1.sendKeys("hello");
		if(wb1.isEnabled()==true)
			System.out.println("pass");
			else
			System.out.println("fail");
		
		wb1.sendKeys("hello");
		System.out.println(wb1.getAttribute("value"));
		String value = wb1.getAttribute("value");
		System.out.println(wb1.getAttribute("name"));
		if(value.length() == 5){
			System.out.println("Bingo!!!");
		}
		
	}

}
