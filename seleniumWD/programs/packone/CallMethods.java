package packone;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods.launchApp("http://facebook.com");
		Methods.elementsCount("a", 50);
		Methods.elementsCount("select", 3);
		Methods.elementAvailable("email", true);
		Methods.elementAvailable("pass", false);
		Methods.elementAvailable("day", true);
		Methods.closeApp();
		Methods.launchApp("http://yahoomail.com");
		Methods.elementsCount("img", 10);
		Methods.closeApp();
		

	}

}
