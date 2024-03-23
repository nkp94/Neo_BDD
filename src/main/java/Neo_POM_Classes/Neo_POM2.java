package Neo_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_POM2 {
	WebDriver neo;
	Neo_POM2 nP2 ;
	//Step 1 --> Declaration 

	@FindBy(xpath = "//input[@id='txt_mobilenumber']")private WebElement mn;
	@FindBy(xpath = "//button[@id='frmsubmit']")private WebElement Btn1;
			
			//Step 2 --> Initialization
			public Neo_POM2(WebDriver neo) {
				PageFactory.initElements(neo,this);
			}
			//Step 3 --> Utilization
			
			public void Enter_Mobile_Number(String MN) {
				mn.sendKeys(MN);
			}
			public void Click_Btn1() {
				Btn1.click();
			}

}
