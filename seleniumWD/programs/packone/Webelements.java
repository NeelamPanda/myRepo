package packone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webelements {
	public static WebElement uid;
	
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\WD930\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email2")).sendKeys("abcdef");
		driver.findElement(By.id("email1")).clear();
		driver.findElement(By.id("email1")).sendKeys("xyz123");
		
		uid=driver.findElement(By.id("email"));
		uid.sendKeys("Kishore");
		uid.clear();
		uid.sendKeys("abcdef");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abc123");
		pwd.clear();
		
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/form/div/input[1]")).sendKeys("");
		
		
		
		
		
		

	}

}
