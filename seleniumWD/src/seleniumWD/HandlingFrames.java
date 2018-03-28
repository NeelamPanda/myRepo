package seleniumWD;

import java.io.FileOutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		WebElement f=driver.findElement(By.name("packageListFrame"));
		List<WebElement> lc=driver.switchTo().frame(f).findElements(By.tagName("a"));
		//System.out.println(lc.size());
//		for(int i=0;i<lc.size();i++){
//			System.out.println(lc.get(i).getText());
//		}
//		
		//export all java pakages into excel
		
		FileOutputStream fos=new FileOutputStream("E:\\Tiki\\seleniumWD\\package.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Sheet1", 1);
		
		for(int i=0;i<lc.size();i++){
			String val=lc.get(i).getText();
			Label l=new Label(0, i, val);
			ws.addCell(l);
			
		}
		wwb.write();wwb.close();
		}

}
