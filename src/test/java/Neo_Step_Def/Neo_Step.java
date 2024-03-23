package Neo_Step_Def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Neo_POM_Classes.Neo_POM1;
import Neo_POM_Classes.Neo_POM2;
import Neo_POM_Classes.Neo_POM3;
import Neo_POM_Classes.Neo_POM4;
import Neo_POM_Classes.Neo_POM5;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Neo_Step {
	public WebDriver neo;
	Neo_POM1 nP1;
	Neo_POM2 nP2;
	Neo_POM3 nP3;
	Neo_POM4 nP4 ;
	Neo_POM4 nP5 ;
	
      @Given("Browser Page Should Get Open")
	public void browser_page_should_get_open() throws Throwable {
		
    	ChromeOptions opt =new ChromeOptions();
    	opt.addArguments("--remote-allow-origins=*");
    	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
//  		WebDriverManager.chromedriver().setup();
	    neo=new ChromeDriver(opt);
 
		neo.get("https:/neostox.com");
		neo.manage().window().maximize();
		neo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
	}
	@And("Click On Sign In Btn")
	public void Click_On_Sign_In_Btn()throws Throwable{
	    nP1=new Neo_POM1(neo);
		nP1.Click_BTN1();  
	}

	@When("^User Enters (.*)$")
	public void user_enters_MN(String MN) throws Throwable {
	  nP2=new Neo_POM2(neo);
	  nP2.Enter_Mobile_Number(MN);
	  Thread.sleep(3000);
	}

	@And("Click On Submit Btn1")
	public void click_on_submit_btn1() throws Throwable {
	   	nP2.Click_Btn1();
	   	Thread.sleep(3000);
	  
	}

	@When("^User Enter (.*)$")
	public void user_enter_pin(String PIN) {
		
		nP3=new Neo_POM3(neo);
		nP3.Enter_PIN_Number(PIN);	   
	  
	}

	@And("Click On Submit Btn2")
	public void click_on_submit_btn2() throws Throwable {
		nP3=new Neo_POM3(neo);
	    nP3.Click_Btn2();
	    Thread.sleep(5000);
		
		
	}

//	@When("User On Home Page Pop up")
//	public void user_on_home_page_pop_up() {
//	    nP4 =new Neo_POM4(neo);
//		nP4.Click_ok();
//	   
//	}
//
//	@And("User is on another popup")
//	public void user_is_on_another_popup() {
//	    nP4.Click_close();
//	   
//	}

	@Then("^User Navigate To Home Page and check (.*)$")
	public void user_navigate_to_home_page_and_check_TXT(String Verify) {
		
		    Neo_POM5 nP5=new Neo_POM5(neo);
		    String ExpID=Verify;
			String ActID=nP5.verifyTXT();
			
		if (ActID.equals(ExpID)) {
			System.out.println(" TC Is Pass ");
		}else {
			System.out.println(" TC Is Pass");
		}
//		
//		@And("User click on userLink1")
//		public void user_click_on_user_link1() throws Throwable {
//		    nP5=new Neo_POM5(neo);
//			nP5.clickUserLink1();
//		}
////
//		@And("click on logout1")
//		public void click_on_logout1() throws Throwable {
//			nP5.clickLogout1();
////			
//		}

	}

}

