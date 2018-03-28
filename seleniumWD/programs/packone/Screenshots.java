package packone;

import java.io.File;

import org.openqa.selenium.By;

public class Screenshots {

	public static void main(String[] args) throws Exception{
		
	MethodsScreenshots.launchApp("http://facebook.com");
	MethodsScreenshots.driver.findElement(By.id("email")).sendKeys("abcdef");
	MethodsScreenshots.elementAvailable("pass", true, "C:\\Users\\admin\\Desktop\\11.png");
		
		
		
		
		
		
		
		
		
		
		

	}

}
