package seleniumWD;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrire {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("D:\\Tiki\\seleniumWD\\test.xls");
		//creating  workbook
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		
		//creating sheet
		WritableSheet ws=wwb.createSheet("Sheet1", 1);
		int a=20;
		int b=30;
		int c=a+b;
		int d=a*b;
		
		//creating cell
		Label l=new Label(0, 0, "c ="+c);
		l=new Label(0,1,"d="+d);
		//Adding cell into sheet
		ws.addCell(l);
		
		//saving and closing workbook
		
		wwb.write();
		wwb.close();
		
		
	}

}
