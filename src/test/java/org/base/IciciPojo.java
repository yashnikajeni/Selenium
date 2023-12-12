package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciPojo extends BaseClass {
	public IciciPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//img[@class='goahead'])[1]")
	public WebElement clk;
	
	@FindBy(name = "AuthenticationFG.USER_PRINCIPAL")
	public WebElement user;
	
	@FindBy(name = "AuthenticationFG.ACCESS_CODE")
	public WebElement pass;
	
	@FindBy(id = "VALIDATE_CREDENTIALS1")
	public WebElement log;

	public WebElement getClk() {
		return clk;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	
	

}
