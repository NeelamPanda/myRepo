package seleniumWD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='topGainers']/tbody/tr[5]/td[3]")).getText());
		//for counting number of rows
		WebElement table=driver.findElement(By.xpath(".//*[@id='topGainers']/tbody"));
		
		List<WebElement> rc=table.findElements(By.tagName("tr"));
		System.out.println(rc.size());
		
		//to get the value dynamically
		String xpath1=".//*[@id='topGainers']/tbody/tr[";
		String xpath2="]/td[1]";
		
		for(int i=2;i<rc.size();i++){
			System.out.println(driver.findElement(By.xpath(xpath1+i+xpath2)).getText());
			
		}
	
		//check infi is available or not.If available ,print the percentage 
		String xpath11=".//*[@id='topGainers']/tbody/tr[";
		String xpath12="]/td[1]";
		
		for(int j=2;j<=rc.size();j++){
			String value=driver.findElement(By.xpath(xpath11+j+xpath12)).getText();
			if(value.equals("INFY")==true)
				System.out.println(driver.findElement(By.xpath(xpath11+j+"]/td[3]")).getText());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
