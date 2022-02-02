package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass2 extends BaseClass{
	
	public PomClass2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class='pg-sidebar-wrapper-profile-link-img']")
	private WebElement icon;
	@FindBy(xpath = "//span[text()='Sign In']")
	private WebElement signin;
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//div[@class='cr-sign-in-form__button-wrapper']")
	private WebElement btnsignin;
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement Orders;
	@FindBy(xpath = "//button[@class='pg-history__pagination-next']")
	private WebElement nxtpgbtn;
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnsignin() {
		return btnsignin;
	}
	public WebElement getOrders() {
		return Orders;
	}
	public WebElement getNxtpgbtn() {
		return nxtpgbtn;
	}
	

}
