package packone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsScreenshots {

	public static WebDriver driver;
	public static void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();}	
	
	public static void closeApp(){
		driver.close();	}	
	
	public static void elementAvailable(String loc, boolean exp, String SSPath)throws Exception{
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
		{System.out.println("Pass");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fname=new File(SSPath);
		FileUtils.copyFile(f, fname);}
		else
		{
		System.out.println("Fail");	
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fname=new File(SSPath);
		FileUtils.copyFile(f, fname);
	}	
	}
}
