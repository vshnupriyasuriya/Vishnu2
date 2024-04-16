package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	static WebDriver add;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbar;

	public WebElement searchbar() {
		return searchbar;
	}

	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addtocart;

	public WebElement addtocart() {
	return addtocart;
	}
	
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement checkaddtocart;

	public WebElement checkaddtocart() {
	return checkaddtocart;
	}
	
	public AddToCart(WebDriver driver) {
		this.add = driver;
		PageFactory.initElements(driver, this);
	}

}
