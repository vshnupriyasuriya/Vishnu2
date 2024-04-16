package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Landingpage {

	static WebDriver land;

	@FindBy(xpath="//span[text()='Hello, sign in']")
    private WebElement Signin;

	public WebElement getSignin() {
		return Signin;
	}

	public Amazon_Landingpage(WebDriver driver) {
		this.land=driver;
		PageFactory.initElements(driver,this );
	}

}
