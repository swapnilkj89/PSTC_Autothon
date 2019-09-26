package com.FB.Pages;

import org.openqa.selenium.support.PageFactory;

import com.FB.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleSearchPage  extends TestBase{
	
	//Define locators related to page
	
	
		//@FindBy(xpath = "//*[@src='./assets/images/enrich_logo.svg']")
		//		WebElement LogoOnHomePage;

		
		
		public GoogleSearchPage() {
			
			PageFactory.initElements(driver, this);
		}

		public void AcceptButton()
		{
		MobileElement GoogleSearch = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Accept & continue\")");
		GoogleSearch.click();
		}
		
		public void NextButton()
		{
		MobileElement NextButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Next\")");
		NextButton.click();
		}
		
		public void NoThanksURL()
		{
		MobileElement NextButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"No, thanks\")");
		NextButton.click();
		}
		public void supplyTextInGoogleSearch()
		{
		MobileElement GoogleSearch = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Search or type web address\")");
		GoogleSearch.sendKeys("step-in forum facebook");
		}
		
		public void ClickOnTextStepInForum()
		{
		MobileElement GoogleSearch = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"step-in forum facebook\")");
		GoogleSearch.click();
		}
		
		public void ClickOnCommunityForum()
		{
		MobileElement GoogleSearch = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"step-in forum facebook\")");
		GoogleSearch.click();
		}
		public void ClickOnPosts()
		{
		MobileElement Posts = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Posts\")");
		Posts.click();
		}
		
}
