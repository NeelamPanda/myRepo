package seleniumWD;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelParse {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("D:\\Tiki\\seleniumWD\\excelfile.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
		FileInputStream fis1=new FileInputStream("D:\\Tiki\\seleniumWD\\number.xls");
		Workbook wb1=Workbook.getWorkbook(fis1);
		Sheet s1=wb1.getSheet("Sheet1");
		System.out.println(s.getCell(2,7).getContents());
		System.out.println(s1.getCell(7,8).getContents());
		
//		WebDriver driver=new FirefoxDriver();
//		
//		driver.get(s.getCell(0, 0).getContents());
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1, 1).getContents());
//		
//		driver.findElement(By.id(s.getCell(0, 2).getContents())).sendKeys(s.getCell(1, 2).getContents());
//
		
		
	}

}
