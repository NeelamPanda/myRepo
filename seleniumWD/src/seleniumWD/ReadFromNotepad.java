package seleniumWD;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromNotepad {

	public static void main(String[] args) throws Exception {
		FileReader f=new FileReader("D:\\Tiki\\seleniumWD\\note.txt");
		
		BufferedReader br=new BufferedReader(f);
		
		/*read single line
		System.out.println(br.readLine());
		
		read multiple line
		String str = null;
		while((str = br.readLine()) != null)
			System.out.println(str);
		*/
		String s=br.readLine();
		System.out.println(s);
		String temp[]=s.split("  ");
		String email=temp[0];
		String pass=temp[1];
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		
		
		
		
		br.close();
		
	}

}
