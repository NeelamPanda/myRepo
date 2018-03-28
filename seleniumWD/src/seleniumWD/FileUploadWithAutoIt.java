package seleniumWD;

import org.openqa.selenium.By;

public class FileUploadWithAutoIt {

	public static void main(String[] args) throws Exception {
		
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("https://wetransfer.com/");
		
		rm.driver.findElement(By.xpath("html/body/div[1]/span/div[4]/div/div[2]/div/div[1]/span")).click();
		rm.driver.findElement(By.xpath("html/body/div[1]/span/span/div/div[2]/button")).click();
		rm.driver.findElement(By.xpath("html/body/div[1]/span/span/div[1]/div[1]/div[1]/div[1]/div/h2")).click();
		//calling and executing AutoIt exe file
		
		Runtime.getRuntime().exec("D:\\Tiki\\seleniumWD\\11.exe");
		Thread.sleep(3000);
		
		rm.driver.findElement(By.xpath("html/body/div[1]/span/span/div/div[1]/div[1]/div[2]/div[1]/input")).sendKeys("nilam.tiki@gmail.com");
		rm.driver.findElement(By.xpath("html/body/div[1]/span/span/div/div[1]/div[1]/div[2]/input")).sendKeys("neelampanda1991@gmail.com");
		rm.driver.findElement(By.xpath("html/body/div[1]/span/span/div/div[2]/button")).click();
		//rm.closeApp();
		
	}

}
