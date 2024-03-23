package Neo_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_POM3 {
	WebDriver neo;
	Neo_POM3 nP3 ;
	//Step 1 --> Declaration 
	
	@FindBy(xpath = "//input[@id='accessPinModel_accsspin']")private WebElement pin;
	@FindBy(xpath = "//button[@id='frmsubmit']")private WebElement Btn2;	
	//Step 2 --> Initialization
	public Neo_POM3(WebDriver neo) {
		PageFactory.initElements(neo,this);
	}
	
	//Step 3 --> Utilization
	
	public void Enter_PIN_Number(String PIN) {
		pin.sendKeys(PIN);
	}
	public void Click_Btn2() {
		Btn2.click();
	}
	
	
}
