package seleniumWD;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class consoleRaed {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter pass");
		String pass=sc.next();
		
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).click();
		
		
		
	}

}
