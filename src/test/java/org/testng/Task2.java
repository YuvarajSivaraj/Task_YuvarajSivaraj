package org.testng;

import org.base.BaseClass;
import org.pom.PomClass2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 extends BaseClass{
	@BeforeMethod
	public void testBefore()
	{
	launchBrowser();
	loadUrl("https://trakx.opendax.app/");
	maxBrowser();
	}	
	@AfterMethod
	public void aftertest()
	{
		quit();
	}	
	@Test
	public void testcase1() throws InterruptedException
	{
		PomClass2 p = new PomClass2();
		p.getIcon();
		p.getSignin();
		Thread.sleep(3000);
		p.getEmail();
		p.getPassword();
		p.getBtnsignin();
		Thread.sleep(2000);
		p.getOrders();
		Thread.sleep(2000);
		p.getNxtpgbtn();
		}
}