package com.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA extends BaseClass {

	static WebDriver driver=null;
	
	@BeforeSuite
	public static void beforeSuite() {
		driver = launchbrowser("chrome");
		}
	
	@BeforeTest
	public static void beforeTest() {
		url(driver, "https://www.amazon.in/");
}
	@AfterMethod
	public static void afterMethod() {
		driver.close();
	}
	

//	public static void main(String[] args) throws InterruptedException, AWTException {
	@Test
	public void AmazonFunctionalityTest() throws AWTException {

		
			
		Amazon_Landingpage landpage = new Amazon_Landingpage(driver);
		Amazon_Signpage signinpage = new Amazon_Signpage(driver);
		AddToCart addproduct = new AddToCart(driver);
		WebElement signin = landpage.getSignin();
		clickOnElement(signin);

		WebElement emailfield = signinpage.getEmailfield();
		SendValuesToField(emailfield, "Sharan0406@gmail.com");

		WebElement continuebtn = signinpage.continuebtn();
		clickOnElement(continuebtn);

		WebElement passwordfield = signinpage.passwordfield();
		SendValuesToField(passwordfield, "Ngu@8741");

		WebElement signInSubmitbtn = signinpage.signInSubmitbtn();
		clickOnElement(signInSubmitbtn);

		WebElement searchbar = addproduct.searchbar();
		SendValuesToField(searchbar, "iphone");

		implicitWait(driver, Duration.ofSeconds(10));

		keyboardActionsPressKey(KeyEvent.VK_DOWN);
		keyboardActionsReleaseKey(KeyEvent.VK_DOWN);
		
		keyboardActionsPressEnter(KeyEvent.VK_ENTER);
		keyboardActionsReleaseEnter(KeyEvent.VK_ENTER);

		implicitWait(driver, Duration.ofSeconds(10));

		WebElement addtocart = addproduct.addtocart();
		clickOnElement(addtocart);

		explicitWaitforElementToBeClickable(driver, addtocart);

		WebElement checkaddtocart = addproduct.checkaddtocart();
		clickOnJavaScript(driver, checkaddtocart);
		implicitWait(driver, Duration.ofSeconds(30));

	

	}

}
