package packone;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Export {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\admin\\Desktop\\WD930\\Result.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Output", 1);
		WritableSheet ws1=wwb.createSheet("Output1", 2);
		
		int a=30; int b=40; int c=a*b; int d=b-a;
		
		Label l=new Label(0, 0, "C Value is " + c);
		Label l1=new Label(0, 0, "D Value is " + d);
		
		
		ws.addCell(l);
		ws1.addCell(l1);
		
		wwb.write();
		wwb.close();
				
				
				
				
				
				
				
				
				
				

	}

}
