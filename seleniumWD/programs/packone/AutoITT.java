package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://wetransfer.com/");
		driver.manage().window().maximize();
		
		// Clicking on I Agree button
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/button")).click();
		Thread.sleep(5000);
		// Clicking on Add Your files button
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/h2")).click();
		// Calling AutoIT Exe file
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\0820.exe");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
