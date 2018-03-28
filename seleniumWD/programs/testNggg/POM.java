package testNggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class POM {
	
	// Ist Method
/*public static By uid=By.xpath("xpathExpression");
	By pwd=By.id("pass");*/
	
	// 2nd Method
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(how=How.ID, using="day") WebElement day;
	

}
