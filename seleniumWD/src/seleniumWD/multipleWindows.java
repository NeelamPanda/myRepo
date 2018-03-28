package seleniumWD;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class multipleWindows {

	public static void main(String[] args) throws Exception {
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("http://www.facebook.com");
		Thread.sleep(3000);
		rm.driver.findElement(By.id("privacy-link")).click();
		Thread.sleep(3000);
		rm.driver.findElement(By.id("cookie-use-link")).click();
		ArrayList a=new ArrayList(rm.driver.getWindowHandles());
		//System.out.println(a.size());
		for(int i=0;i<a.size();i++){
			if(i==0)
			rm.driver.switchTo().window((String)a.get(i)).findElement(By.id("email")).sendKeys("nilam.tiki@gmail.com");
			
			if(i==1)
			rm.driver.switchTo().window((String)a.get(i)).findElement(By.id("pass")).sendKeys("hiiii");
			//System.out.println(lc.size());
			if(i==2)
			rm.driver.switchTo().window((String)a.get(i)).findElement(By.xpath(".//*[@id='u_0_2']")).click();
			
			rm.driver.switchTo().window((String)a.get(i)).close();
		}
	}

}
