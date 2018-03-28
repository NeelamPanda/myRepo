package junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_Sample {	
	@BeforeClass
	public static void a1(){
		System.out.println("This is Before");	}
	@AfterClass
	public static void b1(){
		System.out.println("This is After");	}
	@Test
	public void c1(){
		System.out.println("This is Test1");	}
	@Ignore
	@Test
	public void d1(){
		System.out.println("This is Test2");	}
	@Test
	public void e1(){
		System.out.println("This is Test3");	}
	
	
	
	
	
	
	
	
	

}
