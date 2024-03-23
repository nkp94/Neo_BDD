package Neo_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_POM4 {
	WebDriver neo;
	Neo_POM4 nP4 ;
	//Step 1 --> Declaration 
	
		
		@FindBy(xpath = "(//div[@class='col-lg-12 text-center']/a)[5]")private WebElement ok;
		@FindBy(xpath = "(//div[@class='col-lg-12 py-2 text-center']/a)")private WebElement close;
		
	//Step 2 --> Initialization (//a[.='OK'])[2]    (//div[@class='col-lg-12 text-center']/a)[5]
		public Neo_POM4(WebDriver neo) {
			PageFactory.initElements(neo,this);
		}
		
	//Step 3 --> Utilization
		
		public void Click_ok() {
			ok.click();
		}
		
		public void Click_close() {
			close.click();
		}

		
}
