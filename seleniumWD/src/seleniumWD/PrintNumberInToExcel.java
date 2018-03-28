package seleniumWD;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.biff.WorkspaceInformationRecord;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class PrintNumberInToExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("D:\\Tiki\\seleniumWD\\number.xls");
		
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet s=wwb.createSheet("Sheet1", 1);
		
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				Label l=new Label(i,j, j+1+"");
				s.addCell(l); 
			}
		}
		
		wwb.write();
		wwb.close();
		
	}

}
