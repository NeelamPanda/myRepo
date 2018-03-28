package packone;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_App {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\WD930\\Test1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet7");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(s.getCell(1, 0).getContents())).sendKeys(s.getCell(2, 0).getContents());
		driver.findElement(By.id(s.getCell(3, 0).getContents())).sendKeys(s.getCell(4, 0).getContents());
		
		
		
		
		
		
		
		
		
		
		

	}

}
