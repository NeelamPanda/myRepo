package seleniumWD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicXpathWithWebTable {

	public static void main(String[] args) {
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		
		//WebElement table=rm.driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody"));
		List<WebElement> rowcount=rm.driver.findElements(By.tagName("tr"));
		for(int i=2;i<=rowcount.size();i++){
			System.out.println(rm.driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr[" +i+ "]/td[1]")).getText());
			
		}
	
	}

}
