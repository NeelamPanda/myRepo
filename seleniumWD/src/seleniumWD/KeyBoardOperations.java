package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperations {

	public static void main(String[] args) {
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("https://www.nseindia.com/");
		
		Actions a=new Actions(rm.driver);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		a.sendKeys(Keys.CONTROL +"t").build().perform();
//		a.sendKeys(Keys.F5).build().perform();
//		WebElement wb=rm.driver.findElement(By.xpath(".//*[@id='main_prd']/a"));
//		a.moveToElement(wb).build().perform();
//		rm.driver.findElement(By.xpath(".//*[@id='main_equitie']/a")).click();

		//for drag and drop
		
		//WebElement source=rm.driver.findElement(By.xpath(".//*[@id='bannerImg']"));
		WebElement source=rm.driver.findElement(By.xpath(".//*[@id='main_prd']/a"));
		WebElement destination=rm.driver.findElement(By.xpath(".//*[@id='keyword']"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(source.isDisplayed() && destination.isDisplayed())
			a.dragAndDrop(source, destination).build().perform();
		else
			System.out.println("One of the element was not yet ready!!");
		
		
		
		
	}

}
