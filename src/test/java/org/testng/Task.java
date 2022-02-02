package org.testng;

import java.util.concurrent.TimeUnit;
import org.base.BaseClass;
import org.pom.PomClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class Task extends BaseClass{		
		@BeforeMethod
		public void testBefore()
		{
		launchBrowser();
		loadUrl("https://www.saucedemo.com/");
		maxBrowser();
		}		
		@AfterMethod
		public void aftertest()
		{
			quit();
		}		
		@Test(groups = "Asscending")
		public void testcase1() {
			PomClass p = new PomClass();
			p.getUsername();
			p.getPassword();
			p.getLoginBtn();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.atoz();			
			}		
		@Test(groups = "Descending")
		public void testcase2() {
			PomClass p = new PomClass();
			p.getUsername();
			p.getPassword();
			p.getLoginBtn();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.ztoa();			
			}		
		@Test(groups = "Price Low to High")
		public void testcase3() {
			PomClass p = new PomClass();
			p.getUsername();
			p.getPassword();
			p.getLoginBtn();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.lowtohigh();			
			}		
		@Test(groups = "Price High to Low")
		public void testcase4() {
			PomClass p = new PomClass();
			p.getUsername();
			p.getPassword();
			p.getLoginBtn();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.hightolow();			
			}
		}
