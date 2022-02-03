package org.pom;

import java.util.List;

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
	@FindBy(xpath = "//*[@id=\'root\']/header/div/div[2]/a[2]/span")
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
		driver.findElement(By.xpath("//*[@id=\'root\']/header/div/div[2]/a[2]/span")).click();
	}
	public void getNxtpgbtn() {
		int rowsize = driver.findElements(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/table/tbody/tr")).size();
		System.out.println(rowsize);
		
		if (rowsize==25) {
			
			btnClick(nxtpgbtn);
			
		}
	
	}
	

}
