package seleniumWD;

import org.openqa.selenium.By;

public class DownloadWithAutoIt {

	public static void main(String[] args) {
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		rm.driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("nilam.tiki");
		rm.driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rm.driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("kittyandtapas");
		rm.driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		//rm.closeApp();
	}
	

}
