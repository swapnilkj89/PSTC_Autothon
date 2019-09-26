package com.FB.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling  extends com.FB.base.TestBase{
	
	
	
	public Scrolling() {
		
		PageFactory.initElements(driver, this);
	}

	public void scrollDown() {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
			
		@SuppressWarnings("rawtypes")
		TouchAction touchaction = new TouchAction(driver);
		touchaction.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}
 
	
	public List<MobileElement> getItemWebView(){
		return ((AndroidDriver<MobileElement>)driver).findElementsByAndroidUIAutomator("new UiSelector().text(\"https://www.facebook.com › comm... STeP-IN Forum - Community | Facebook\r\n" + 
				"\")");
	}
	
	public void scrollTillWebView() throws InterruptedException {
				
		while(getItemWebView().size() == 0) {
			scrollDown();
		}
		
		if(getItemWebView().size() > 0) {
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);	
		
	}

}
