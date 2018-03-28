package packone;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Console {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=s.nextInt();
		System.out.println("Enter B Value");
		int b=s.nextInt();
		System.out.println(a*b);
		System.out.println("Enter URL");
		String url=s.next();
		WebDriver driver=new FirefoxDriver();
		driver.get(url);

		
	}

}
