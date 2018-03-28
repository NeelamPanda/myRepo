package packone;

import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Export_App {
public static void main(String[] args) throws Exception{
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\admin\\Desktop\\WD930\\FBApp.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Output", 1);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		boolean a=driver.findElement(By.id("email")).isDisplayed();
		if(a==true)
		{
			Label l=new Label(0, 0, "Varifying Email");
		    Label l1=new Label(1, 0, "Pass");
		    ws.addCell(l); ws.addCell(l1);
		 }
		else
		{
			Label l=new Label(0, 0, "Varifying Email");
		    Label l1=new Label(1, 0, "Fail");
		    ws.addCell(l); ws.addCell(l1);
		}	
		boolean b=driver.findElement(By.id("pass")).isDisplayed();
		if(b==false)
		{
			Label l=new Label(0, 1, "Varifying Password");
		    Label l1=new Label(1, 1, "Pass");
		    ws.addCell(l); ws.addCell(l1);
		}
		else
		{
			Label l=new Label(0, 1, "Varifying Password");
		    Label l1=new Label(1, 1, "Fail");
		    ws.addCell(l); ws.addCell(l1);
		}	
		wwb.write();
		wwb.close();
		
		
		
		
		
		
		
		
}
}
