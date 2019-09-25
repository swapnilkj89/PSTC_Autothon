package com.enrich.util;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.touch.offset.PointOption;

public class CommonFunction extends TestBase{
	
		
		
		public CommonFunction() {
			
			PageFactory.initElements(driver, this);
		}
	
		
	public static void hideKeyboard() {
		
		driver.hideKeyboard();
	}

	public static void explicitWait() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Allow')]")));
	}
	
	public static void explicitWaitforSAVE() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Save')]")));
	}
	
	@SuppressWarnings("rawtypes")
	public static void swipeBottomToTop() {
		
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width  = dim.getWidth();
		
		int startx= width/8;
		int endx=width/8;
		int starty= (int) (height*.70);
		int endy=(int) (height*.65);
		
		TouchAction touchaction = new TouchAction(driver);
		touchaction.press(PointOption.point(startx, starty)).moveTo((PointOption.point(endx, endy))).release().perform();
	}
	
public static void swipeTopToBottom() {
		
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width  = dim.getWidth();
		
		int startx= width/2;
		int endx=width/2;
		int starty= (int) (height*.50);
		int endy=(int) (height*.73);
		
		TouchAction touchaction = new TouchAction(driver);
		touchaction.press(PointOption.point(startx, starty)).moveTo((PointOption.point(endx, endy))).release().perform();
	}

	
}
