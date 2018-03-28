package seleniumWD;

public class TestReusableMethod {
	public static void main(String[] args) {
		ReusableMethod rm=new ReusableMethod();
		rm.launchApp("http://facebook.com");
		rm.elementPresent("email", true);
		rm.elementPresent("pass", false);
		
		rm.elementEnabled("u_0_3", true);
		
		rm.closeApp();
	}
}
