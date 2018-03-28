package gridd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BrowserStack {
	 public static final String USERNAME = "kishore141";
	  public static final String AUTOMATE_KEY = "qZyoeFUr1RA8h4ax8Sp2";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Firefox");
	    caps.setCapability("browser_version", "33");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "XP");
	    caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.facebook.com");
	    WebElement element = driver.findElement(By.id("email"));

	    element.sendKeys("Kishore");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
	    
	    
	  }
}
