package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void pageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void quit() {
		driver.quit();
	}

	public static void fill(WebElement element, String userText) {
		element.sendKeys(userText);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void selectByVisibleText(WebElement element, String userText) {
		Select sl = new Select(element);
		sl.selectByVisibleText(userText);
	}

	public static void impwaits(int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}

	public static void findElements(String xpath) {
		driver.findElements(By.xpath(xpath));
		return;
	}

}
