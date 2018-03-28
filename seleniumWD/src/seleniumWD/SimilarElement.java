package seleniumWD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimilarElement {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//count multiple links 
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		//count multiple ListBoxes in facebook page
		
		List<WebElement> listbox=driver.findElements(By.tagName("select"));
		System.out.println(listbox.size());
		
		//Name of the LInk
		
		List<WebElement> linkname=driver.findElements(By.tagName("a"));
		for(int i=0;i<linkname.size();i++){
			//System.out.println(linkname.get(i).getText());
			
			//print link name startswith M
			String result=linkname.get(i).getText();
			if(result.startsWith("M"))
				System.out.println(result);
		}
		
		//print multiple lines along with href
		List<WebElement> linkname1=driver.findElements(By.tagName("a"));
		for(int i=0;i<linkname1.size();i++){
			System.out.println(linkname1.get(i).getText() + "--" +linkname1.get(i).getAttribute("href"));
			
		}
		
		
	}

}
