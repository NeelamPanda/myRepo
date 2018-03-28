package packone;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Rows {
	
public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\WD930\\Test1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet7");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		int cc=s.getColumns();
		int rc=s.getRows();
		int i; int j;
		for(i=0; i<cc; i++){
			for(j=0; j<rc; j++){
				String val=s.getCell(i, j).getContents();
						
				driver.findElement(By.id("email")).sendKeys(val);
				driver.findElement(By.id("email")).clear();
						
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
