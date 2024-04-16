package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Signpage {

	static WebDriver Signin;

	@FindBy(name = "email")
	private WebElement emailfield;

	public WebElement getEmailfield() {
		return emailfield;
	}

	@FindBy(id = "continue")
	private WebElement continuebtn;

	public WebElement continuebtn() {
		return continuebtn;
	}

	@FindBy(name = "password")
	private WebElement passwordfield;

	public WebElement passwordfield() {
		return passwordfield;
	}

	@FindBy(id = "signInSubmit")
	private WebElement signInSubmitbtn;

	public WebElement signInSubmitbtn() {
		return signInSubmitbtn;
	}

	

	public Amazon_Signpage(WebDriver driver) {
		this.Signin = driver;
		PageFactory.initElements(driver, this);
	}
}
