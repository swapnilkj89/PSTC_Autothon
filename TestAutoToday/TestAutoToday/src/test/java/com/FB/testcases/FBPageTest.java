package com.FB.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FB.Pages.GoogleSearchPage;
import com.FB.base.TestBase;
import com.FB.util.CommonFunction;
import com.FB.util.Scrolling;


public class FBPageTest extends TestBase{
	
	GoogleSearchPage googleSearchPage;
	Scrolling scrolling;
	CommonFunction commonFunction;
	//ExtentReports extent;
	
	public FBPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException 
	 {
		try {
			initialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		googleSearchPage = new GoogleSearchPage();
		scrolling = new Scrolling();
		commonFunction =new CommonFunction();
	 }
	
	//Checking SIGNUP button Text
	@SuppressWarnings("static-access")
	@Test(priority=1)
	public void TestStepInForum() throws InterruptedException
	{
		googleSearchPage.AcceptButton();
		googleSearchPage.NextButton();
		googleSearchPage.NoThanksURL();
		googleSearchPage.supplyTextInGoogleSearch();
		googleSearchPage.ClickOnTextStepInForum();
		//scrolling.scrollTillWebView();
		Thread.sleep(5000);
		//commonFunction.swipeBottomToTop();
		//commonFunction.swipeBottomToTop();
		scrolling.scrollDown();
		scrolling.scrollDown();
		Thread.sleep(5000);
		commonFunction.taponscreen();
		googleSearchPage.ClickOnPosts();
	}
}
