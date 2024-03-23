package Neo_POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Neo_POM1 {
    WebDriver neo;
//	Neo_POM1 nP1;
	//Step 1 --> Declaration 
	
		//WebElement a=neo.findElement(By.xpath("(//a[.='Sign In'])[1]"));
	  @FindBy(xpath = "(//a[.='Sign In'])[1]")private WebElement Btn1;
		//(//a[@class='nav-link'])[7]
		//(//a[.='Sign In'])[1]
		//Step 2 --> Initialization
		public Neo_POM1(WebDriver neo) {
			this.neo=neo;
			PageFactory.initElements(neo,this);
		}		
		//Step 3 --> Utilization
		
		public void Click_BTN1() throws Exception {
			Btn1.click();
		}
	

}
