package Neo_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_POM5 {
	WebDriver neo;
	Neo_POM5 nP5 ;
	// Declaration
				@FindBy(xpath="//span[.='Rs.8,50,000.00']")private WebElement Text1;
				@FindBy(xpath = "//span[@id='lbl_username']")private WebElement UserLink1;
//				@FindBy(xpath= By.linkText("Logout")) private WebElement logout;
				@FindBy(xpath = "//span[.='Logout']")private WebElement logout1;
				// Initialization
				public Neo_POM5(WebDriver neo){
					PageFactory.initElements(neo,this);
				}
				
				// Utilization
				
				
				public String verifyTXT() {
					
					String ActID1 = Text1.getText();
					return ActID1;		
				}
				public void clickUserLink1()  {
					UserLink1.click();
					
				}
				
				public void clickLogout1() {
					
					logout1.click();
					
				}

}