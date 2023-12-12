package org.stepdefinition;

import org.base.BaseClass;
import org.base.IciciPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Icici extends BaseClass {
	
	IciciPojo i ;
	@Given("To launch the chrome browser and maximize the windows")
	public void to_launch_the_chrome_browser_and_maximize_the_windows() {
		launchbrowser();
		windowmaximize();
	    
	}

	@When("To launch url of Icici application")
	public void to_launch_url_of_Icici_application() {
		launchurl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	    
	}

	@When("To click the arrow")
	public void to_click_the_arrow() throws InterruptedException {
		Thread.sleep(3000);
		i=new IciciPojo();
		clikbtn(i.getClk());
	    
	}

	@When("To pass email in username field")
	public void to_pass_email_in_username_field() throws InterruptedException {
		Thread.sleep(3000);
		i=new IciciPojo();
		passtext("asdfghjk@gmail.com", i.getUser());
	  
	}

	@When("To pass password in password field")
	public void to_pass_password_in_password_field() {
		i=new IciciPojo();
		passtext("1234567890", i.getPass());
	   
	}

	@When("To click on login")
	public void to_click_on_login() {
		i=new IciciPojo();
		clikbtn(i.getLog());
	  
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	closebrowser();
	    
	}


	

}
