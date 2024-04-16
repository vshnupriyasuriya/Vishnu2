package com.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver launchbrowser(String browsername) {
		WebDriver driver;

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
//		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		return driver;

	}

	public static void url(WebDriver driver,String URL) {
    driver.get(URL);
    }
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void SendValuesToField(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void implicitWait(WebDriver driver, Duration duration) {

		driver.manage().timeouts().implicitlyWait(duration);

	}

	public static void explicitWaitforElementToBeClickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void Scrolloffsetjavascript1(WebDriver driver, int xoffset, int Yoffset) {
		JavascriptExecutor Javascript = (JavascriptExecutor) driver;
		Javascript.executeScript("window.scrollBy(" + xoffset + "," + Yoffset + ");", "");
	}

	public static void clickOnJavaScript(WebDriver driver, WebElement element) {
		JavascriptExecutor Javascript = (JavascriptExecutor) driver;
		Javascript.executeScript("arguments[0].click();", element);
	}

	public static void keyboardActionsPressKey(int keyEvent) throws AWTException {
		Robot down = new Robot();

		down.keyPress(keyEvent);
	}

	public static void keyboardActionsReleaseKey(int keyEvent) throws AWTException {
		Robot down = new Robot();

		down.keyRelease(keyEvent);
	}

	public static void keyboardActionsPressEnter(int keyEvent) throws AWTException {
		Robot down = new Robot();

		down.keyPress(keyEvent);
	}

	public static void keyboardActionsReleaseEnter(int keyEvent) throws AWTException {
		Robot down = new Robot();

		down.keyRelease(keyEvent);
	}


	

}
