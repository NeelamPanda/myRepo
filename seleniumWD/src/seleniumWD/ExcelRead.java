package seleniumWD;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("E:\\Tiki\\seleniumWD\\number.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
		int rc=s.getRows();
		int cc=s.getColumns();
		for(int i=0;i<cc;i++){
			for(int j=0;j<rc;j++){
			//System.out.println(s.getCell(i, j).getContents());
				String value=s.getCell(i, j).getContents();
				if(value.equals("Neelam"))
					System.out.println(i + "---"+j);
				
		}}
		
		
	}

}
