package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		
		List<WebElement> lcount=driver.findElements(By.tagName("a"));
		//System.out.println(lcount.size());
		int i;
		for(i=0; i<lcount.size(); i++){
			System.out.println(lcount.get(i).getText() + "-" + lcount.get(i).getAttribute("href"));
			
			
		}
		

	}

}
