package gridd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_App2 {

	public static final String USERNAME = "kishore141";
	public static final String AUTOMATE_KEY = "qZyoeFUr1RA8h4ax8Sp2";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "54");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browserstack.debug", "true");
	    
	   /* java.net.URL u=new java.net.URL(URL);
	    RemoteWebDriver r=new RemoteWebDriver(u, caps);
	    WebDriver driver=r;*/
	    
	    WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);

	    driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("email")).sendKeys("Kishore");
	    driver.findElement(By.id("pass")).sendKeys("abcdef");
	    
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	    

	  

	  }
}
