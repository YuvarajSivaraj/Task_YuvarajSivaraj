package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass2 extends BaseClass{
	
	public PomClass2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class='pg-sidebar-wrapper-profile-link-img']")
	 WebElement icon;
	@FindBy(xpath = "//span[text()='Sign In']")
	 WebElement signin;
	@FindBy(xpath = "//input[@placeholder='Email']")
	 WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")
	 WebElement password;
	@FindBy(xpath = "//div[@class='cr-sign-in-form__button-wrapper']")
	 WebElement btnsignin;
	@FindBy(xpath = "//span[text()='Orders']")
	 WebElement Orders;
	@FindBy(xpath = "//button[@class='pg-history__pagination-next']")
	 WebElement nxtpgbtn;
	public void getIcon() {
		btnClick(icon);
	}
	public void getSignin() {
		btnClick(signin);
	}
	public void getEmail() {
		fill(email, "keshav@trakx.io");
	}
	public void getPassword() {
		fill(password, "Murthykeshav@7");
	}
	public void getBtnsignin() {
		btnClick(btnsignin);
	}
	public void getOrders() {
		btnClick(Orders);
	}
	public void getNxtpgbtn() throws InterruptedException {
		String nxtbtn = driver.findElement(By.xpath("//button[@class='pg-history__pagination-next']")).getAttribute("class");
		System.out.println(nxtbtn);
	
		while(!nxtbtn.contains("disabled"))
		{
		 btnClick(nxtpgbtn);
		Thread.sleep(2000);
		nxtbtn = driver.findElement(By.xpath("//button[@class='pg-history__pagination-next']")).getAttribute("class");
	}
		quit();
	}
	

}
