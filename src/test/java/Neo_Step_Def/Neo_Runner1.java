package Neo_Step_Def;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featuresNeo/Neo20.feature",glue = {"Neo_Step_Def"},plugin= {"pretty","html:target/Neo1/Neo.html"})
public class Neo_Runner1 {
	
	

}
