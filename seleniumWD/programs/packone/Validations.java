package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\WD930\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abcdef");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		String c=driver.getTitle();
		System.out.println(c);
		String d=driver.getCurrentUrl();
		System.out.println(d);
		/*driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://yahoomail.com");
		*/
		System.out.println(driver.findElement(By.id("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.id("email")).getTagName());
		System.out.println(driver.findElement(By.id("email")).getLocation());
		System.out.println(driver.findElement(By.id("email")).getSize());
		
		
		
		
		
		
		

	}

}
