package packone;

import java.io.BufferedReader;
import java.io.FileReader;

public class Notepad_MultipleRows {

	public static void main(String[] args) throws Exception{
		
		FileReader f=new FileReader("C:\\Users\\admin\\Desktop\\WD930\\123.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null)
			System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
