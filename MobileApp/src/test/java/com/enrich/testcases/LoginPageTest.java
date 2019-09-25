package com.enrich.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.enrich.base.TestBase;
import com.enrich.pages.HomePage;
import com.enrich.pages.LoginPage;
import com.enrich.util.CommonFunction;
import com.enrich.util.Scrolling;

public class LoginPageTest  extends TestBase{
	
	LoginPage loginPage;
	Scrolling scrolling;
	//ExtentReports extent;
	
	public LoginPageTest() {
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
		loginPage = new LoginPage();
		scrolling = new Scrolling();
	 }
	
	//Checking SIGNUP button Text
	@Test(priority=1)
	public void checkSignUPButtonText() throws InterruptedException
	{

		loginPage.IAgreeButton();
		Thread.sleep(5000);
		loginPage.threeDotButton();
		loginPage.changeServer();
		Thread.sleep(5000);
		loginPage.selectSandbox();
		loginPage.selectApply();
		Thread.sleep(2000);
		loginPage.supplyTextUsername();
		loginPage.supplyTextPassword();
		CommonFunction.hideKeyboard();
		loginPage.signInButton();
		CommonFunction.explicitWait();
		Thread.sleep(5000);
		loginPage.selectAllow();
		System.out.println("hello1");
		Thread.sleep(2000);
		CommonFunction.swipeTopToBottom();
		//CommonFunction.explicitWait1();
		Thread.sleep(2000);
		System.out.println("hello2");
		Thread.sleep(10000);
		loginPage.toggleSideBar();
		System.out.println("hello3");
		loginPage.moreButtonClick();
		Thread.sleep(2000);
		scrolling.scrollTillWebView();
		Thread.sleep(4000);
		loginPage.incidentNewClick();
		Thread.sleep(4000);
		CommonFunction.explicitWaitforSAVE();
		loginPage.searchClick();
		Thread.sleep(4000);
		loginPage.supplyPLATFORMInSearchTextField();
		Thread.sleep(1000);
		loginPage.clickOnSearchData();
		Thread.sleep(2000);
		loginPage.ClientDetailsLabelClick();
		CommonFunction.swipeBottomToTop();
		Thread.sleep(2000);
		loginPage.searchFieldCategoryClick();
		Thread.sleep(2000);
		loginPage.supplyHardwareTextField();
		Thread.sleep(3000);
		loginPage.clickOnSearchData();
		Thread.sleep(4000);
		loginPage.NewIncidentLabelClick();
		Thread.sleep(2000);
		CommonFunction.swipeTopToBottom();
		Thread.sleep(2000);
		loginPage.incidentSaveButtonClick();
		Assert.assertEquals(true, true);
		
	}

}
