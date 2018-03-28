package seleniumWD;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("E:\\Tiki\\seleniumWD\\123.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Sheet1", 1);
		
		int a=20;
		int b=30;
		int c=a+b;
		
		Label l=new Label(0, 0, "c ="+c);
		ws.addCell(l);
		wwb.write();
		wwb.close();
		
	}

}
