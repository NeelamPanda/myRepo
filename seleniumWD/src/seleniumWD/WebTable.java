package seleniumWD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static void main(String[] args) {

		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("https://nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		
		//Get the data from webtable
		
		//WebElement table=rm.driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr[5]/td[4]"));
		//System.out.println(table.getText());
		//count number of rows in webtable
		WebElement table=rm.driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody"));
		List<WebElement> rowcount=table.findElements(By.tagName("tr"));
		System.out.println(rowcount.size());
		
		rm.closeApp();
		
	}

}
