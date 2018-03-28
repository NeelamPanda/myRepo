package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		
		// Importing Actions
		Actions a=new Actions(driver);
		
		// Creating Webelement for Products Menu
		WebElement products=driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[3]/a"));
		
		// Moving Cursor to Products 
		a.moveToElement(products).build().perform();
				
		/*// Clicking on Mutual Funds link under products menu
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[3]/div/ul/li[1]/ul/li[3]/a")).click();*/
		
		// Creating webelement for menu
		WebElement menu=driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[3]/div/ul/li[1]/ul"));
		// Counting number of links under menu
		List<WebElement> lc=menu.findElements(By.tagName("li"));
		String xpath1="html/body/div[2]/div[1]/div[4]/ul/li[3]/div/ul/li[1]/ul/li[";
		String xpath2="]/a";
		int i;
		for(i=1; i<=lc.size(); i++){
		//	System.out.println(driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[3]/div/ul/li[1]/ul/li[" + i + "]/a")).getText());
			System.out.println(driver.findElement(By.xpath(xpath1+i+xpath2)).getText());
		}
		
		
		
		
		
		
		

	}

}
