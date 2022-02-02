package org.testng;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.PomClass2;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 extends BaseClass{
	@BeforeTest
	public void testBefore()
	{
	launchBrowser();
	loadUrl("https://trakx.opendax.app/");
	maxBrowser();
	}
	
//	@AfterTest
//	public void aftertest()
//	{
//		quit();
//	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		PomClass2 p = new PomClass2();
		btnClick(p.getIcon());
		btnClick(p.getSignin());
		Thread.sleep(3000);
		fill(p.getEmail(), "keshav@trakx.io");
		fill(p.getPassword(), "Murthykeshav@7");
		btnClick(p.getBtnsignin());
		Thread.sleep(3000);
		btnClick(p.getIcon());
		btnClick(p.getOrders());
		Thread.sleep(3000);		
		List<WebElement> pgnxt = driver.findElements(By.xpath("//button[@class='pg-history__pagination-next']"));
		for (int i = 0; i < pgnxt.size(); i++) {
			pgnxt.get(i).click();
			
		}
		
	}
	

}
