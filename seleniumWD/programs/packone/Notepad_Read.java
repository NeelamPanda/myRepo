package packone;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notepad_Read {

	public static void main(String[] args) throws Exception {
		
		FileReader f=new FileReader("C:\\Users\\admin\\Desktop\\WD930\\123.txt");
		BufferedReader b=new BufferedReader(f);
		String val=b.readLine();
		
		String[] value=val.split(" ");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(value[0]);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(value[1]);
		driver.findElement(By.id("pass")).sendKeys(value[2]);
		
		
	}

}






