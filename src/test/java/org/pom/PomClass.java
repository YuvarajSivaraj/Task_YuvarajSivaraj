package org.pom;

	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

	public class PomClass extends BaseClass{
		
		public PomClass() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="user-name")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		@FindBy(name="login-button")
		WebElement loginBtn;
		@FindBy(xpath="//select[@class='product_sort_container']")
		WebElement filter;
		@FindBy(xpath = "//div[@class='inventory_item_name']")
		WebElement itemname;
		public void getUsername() {
			fill(username, "standard_user");
		}
		public void getPassword() {
			fill(password, "secret_sauce");
		}
		public void getLoginBtn() {
			btnClick(loginBtn);
		}
		
		public void atoz() {
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<String> bfrfilter = new ArrayList<String>();
			for(WebElement p : itemname)
			{
				p.getText();				
			}
			selectByVisibleText(filter, "Name (A to Z)");
			List<WebElement> afteritemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<String> afterfilter = new ArrayList<String>();
			for(WebElement a : afteritemname)
			{
				a.getText();
			}				
			Collections.sort(bfrfilter);
			Assert.assertEquals(bfrfilter, afterfilter);
			}
		public void ztoa() {
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<String> bfrfilter = new ArrayList<String>();
			for(WebElement p : itemname)
			{
				p.getText();				
			}
			selectByVisibleText(filter, "Name (Z to A)");
			List<WebElement> afteritemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<String> afterfilter = new ArrayList<String>();
			for(WebElement a : afteritemname)
			{
				a.getText();
			}				
			Collections.sort(bfrfilter);
			Assert.assertEquals(bfrfilter, afterfilter);
			}
			
	
			public void hightolow() {
				List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
				List<Double> bfrfilter = new ArrayList<Double>();
				for(WebElement p : itemname)
				{
					bfrfilter.add(Double.valueOf(p.getText().replace("$", "")));					
				}
				selectByVisibleText(filter, "Price (high to low)");
				List<WebElement> afteritemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
				List<Double> afterfilter = new ArrayList<Double>();
				for(WebElement a : afteritemname)
				{
					afterfilter.add(Double.valueOf(a.getText().replace("$", "")));
				}				
				Collections.sort(bfrfilter);
				Assert.assertEquals(bfrfilter, afterfilter);
		}
				public void lowtohigh() {
					List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
					List<Double> bfrfilter = new ArrayList<Double>();
					for(WebElement p : itemname)
					{
						bfrfilter.add(Double.valueOf(p.getText().replace("$", "")));					
					}
					selectByVisibleText(filter, "Price (low to high)");
					List<WebElement> afteritemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
					List<Double> afterfilter = new ArrayList<Double>();
					for(WebElement a : afteritemname)
					{
						afterfilter.add(Double.valueOf(a.getText().replace("$", "")));
					}				
					Collections.sort(bfrfilter);
					Assert.assertEquals(bfrfilter, afterfilter);
		
	
	
				
}
}
