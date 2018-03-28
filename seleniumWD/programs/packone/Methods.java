package packone;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Methods {
	public static WebDriver driver;
	public static void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();}	
	public static void closeApp(){
		driver.close();	}	
	public static void elementAvailable(String loc, boolean exp){
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");	}	
	public static void elementsCount(String loc, int exp){
		List<WebElement> ecount=driver.findElements(By.tagName(loc));
		if(ecount.size()==exp)
			System.out.println("pass" + "-" + ecount.size());
		else
			System.out.println("Fail" + "-" + ecount.size());
	}
	
	
	
	
	
	
	
	
	
	
	

}
