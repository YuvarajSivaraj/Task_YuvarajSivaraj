package org.pom;

	import org.base.BaseClass;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PomClass extends BaseClass{
		
		public PomClass() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="user-name")
		private WebElement username;
		@FindBy(id="password")
		private WebElement password;
		@FindBy(name="login-button")
		private WebElement loginBtn;
		@FindBy(xpath="//select[@class='product_sort_container']")
		private WebElement filter;
		public WebElement getUsername() {
			return username;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		public WebElement getFilter() {
			return filter;
		}
			
			

	}



