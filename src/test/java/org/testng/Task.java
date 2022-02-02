package org.testng;

import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.concurrent.TimeUnit;

	import org.base.BaseClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.pom.PomClass;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Task extends BaseClass{
		
		@BeforeTest
		public void testBefore()
		{
		launchBrowser();
		loadUrl("https://www.saucedemo.com/");
		maxBrowser();
		}
		
		@AfterTest
		public void aftertest()
		{
			quit();
		}
		
		@Test(groups = "Asscending")
		public void testcase1() {
			PomClass p = new PomClass();
			fill(p.getUsername(), "standard_user");
			fill(p.getPassword(), "secret_sauce");
			btnClick(p.getLoginBtn());
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			selectByVisibleText(p.getFilter(), "Name (A to Z)");
			Map<String, Integer> map= new LinkedHashMap<String, Integer>();
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			for (int i = 0; i < itemname.size(); i++) {
				String name = itemname.get(i).getText();
				System.out.println(name);
			
			}
		}
		@Test(groups = "Descending")
		public void testcase2() {
			launchBrowser();
			loadUrl("https://www.saucedemo.com/");
			maxBrowser();
			
			PomClass p = new PomClass();
			fill(p.getUsername(), "standard_user");
			fill(p.getPassword(), "secret_sauce");
			btnClick(p.getLoginBtn());
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			selectByVisibleText(p.getFilter(), "Name (Z to A)");
			Map<String, Integer> map= new LinkedHashMap<String, Integer>();
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			for (int i = 0; i < itemname.size(); i++) {
				String name = itemname.get(i).getText();
				System.out.println(name);
			
			}
		}
		
		@Test(groups = "Price Low to High")
		public void testcase3() {
			launchBrowser();
			loadUrl("https://www.saucedemo.com/");
			maxBrowser();
			
			PomClass p = new PomClass();
			fill(p.getUsername(), "standard_user");
			fill(p.getPassword(), "secret_sauce");
			btnClick(p.getLoginBtn());
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			selectByVisibleText(p.getFilter(), "Price (low to high)");
			Map<String, Integer> map= new LinkedHashMap<String, Integer>();
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			for (int i = 0; i < itemname.size(); i++) {
				String name = itemname.get(i).getText();
				System.out.println(name);
			
			}
		}
		@Test(groups = "Price High to Low")
		public void testcase4() {
			launchBrowser();
			loadUrl("https://www.saucedemo.com/");
			maxBrowser();
			
			PomClass p = new PomClass();
			fill(p.getUsername(), "standard_user");
			fill(p.getPassword(), "secret_sauce");
			btnClick(p.getLoginBtn());
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			selectByVisibleText(p.getFilter(), "Price (high to low)");
			Map<String, Integer> map= new LinkedHashMap<String, Integer>();
			List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			for (int i = 0; i < itemname.size(); i++) {
				String name = itemname.get(i).getText();
				System.out.println(name);
			
			}
		}

	}



