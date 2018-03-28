package packone;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Con {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\WD930\\Test1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet7");
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(1, 0).getContents());
		
		

	}

}
