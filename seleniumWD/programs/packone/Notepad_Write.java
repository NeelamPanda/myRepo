package packone;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Notepad_Write {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\WD930\\OP.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Kishore");
		
		bw.close();
		
		

	}

}
