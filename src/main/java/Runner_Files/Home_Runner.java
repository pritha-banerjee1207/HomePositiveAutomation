package Runner_Files;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src\\main\\java\\Feature_Files\\Home.feature",
		glue= {"App_Script_Lan_wel_page"},
		monochrome = true,publish = true)

public class Home_Runner extends AbstractTestNGCucumberTests {

	

}
