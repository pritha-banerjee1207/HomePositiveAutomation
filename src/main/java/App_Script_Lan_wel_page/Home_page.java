package App_Script_Lan_wel_page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Home_page extends Generic_function{
	public static boolean value;

	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@And("User clicks on Welcome Login button")
	public void home_positive_tc_001() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			click("welcome_login");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	@When("User enters valid phonenumber and password and User click on login")
	public void home_positive_tc_002() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		
		try {

			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",1,5));
			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_password"))).sendKeys(td_reader("login_password",1,6));
			click("login");
			browser_wait(12);

		} catch (IOException e) {
			e.printStackTrace();

		}

		Thread.sleep(2000);
	}



	@When("Click on Wallet tab and should be navigated to Payment manage page")
	public void home_positive_tc_003() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		try {
		 grid_tiles(OR_reader("Object_Locator", "grid_path"));
		 grid_tiles(OR_reader("Object_Locator", "grid_opinion"));
		 grid_tiles(OR_reader("Object_Locator", "grid_refer"));
		 
		}catch(Exception e) {
			
		}
		browser_back();
	  browser_close();
	
	}
}











