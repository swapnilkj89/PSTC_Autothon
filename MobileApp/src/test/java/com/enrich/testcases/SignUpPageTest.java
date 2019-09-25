package com.enrich.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.enrich.base.TestBase;
import com.enrich.pages.HomePage;
import com.enrich.pages.SignUpPage;

public class SignUpPageTest extends TestBase{
	
	HomePage homePage;
	SignUpPage signUpPage;
	//ExtentReports extent;
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		try {
			initialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage = new HomePage();
		signUpPage = new SignUpPage();
		signUpPage = homePage.signUpButtonClick();

	}

	@Test(priority=1)
	public void checkCrossIconStatus() 
	{
		Assert.assertEquals(true, signUpPage.crossIconStatus());
		
	}
	
	@Test(priority=2)
	public void checkCrossIconClick() 
	{
		signUpPage.crossIconClick();
		Assert.assertTrue(true);
	}
		
	@Test(priority=3)
	public void checkLoginButtonText() 
	{
		String LoginText = signUpPage.loginButtonText();
		Assert.assertEquals("LOGIN", LoginText);
	}	
	
	@Test(priority=4)
	public void checkLoginButtonStatus() 
	{
		Assert.assertEquals(true, signUpPage.loginButtonStatus());
	}	
	
	@Test(priority=5)
	public void checkNextIconButtonStatus() 
	{
		Assert.assertEquals(true, signUpPage.nextArrowStatus());
	}	
		
	@Test(priority=6)
	public void checkEnrichImageStatus() 
	{
		Assert.assertEquals(true, signUpPage.enrichImageStatus());
	}	

	@Test(priority=7)
	public void checkConnectWithEmailFaceBookButtonStatus() 
	{
		Assert.assertEquals(true, signUpPage.faceBookButtonStatus());
	}
	
	@Test(priority=8)
	public void checkConnectWithEmailFacebookButtonText() 
	{
		String FacebookText = signUpPage.faceBookButtonText();
		Assert.assertEquals("CONNECT WITH FACEBOOK", FacebookText);
	}	
	
	@Test(priority=9)
	public void checkConnectWithEmailGoogleButtonStatus() 
	{
		Assert.assertEquals(true, signUpPage.googleButtonStatus());
	}
	
	@Test(priority=10)
	public void checkConnectWithEmailGoogleButtonText() 
	{
		String GoogleText = signUpPage.googleButtonText();
		Assert.assertEquals("CONNECT WITH GOOGLE", GoogleText);
	}	
	
	@Test(priority=11)
	public void checkConnectWithEmailButtonStatus() 
	{
		Assert.assertEquals(true, signUpPage.connectWithEmailButtonStatus());
	}
	
	@Test(priority=12)
	public void checkConnectWithEmailButtonText() 
	{
		String ConnectWithEmailText = signUpPage.connectWithEmailButtonText();
		Assert.assertEquals("CONNECT WITH EMAIL", ConnectWithEmailText);
	}	
	
	
	@Test(priority=13)
	public void checkDoYouHaveAReferralCodeCheckboxText() 
	{
		String checkDoYouHaveAReferralCodeCheckboxText = signUpPage.doYouHaveAReferralCodeCheckBoxText();
		Assert.assertEquals("Do you have a referral code?", checkDoYouHaveAReferralCodeCheckboxText);
	}	

	@Test(priority=14)
	public void checkYouHaveAReferralCodeCheckboxStatus() 
	{
		Assert.assertEquals(true, signUpPage.doYouHaveAReferralCodeCheckBoxStaus());
	}	
	
	@Test(priority=15)
	public void checkDoYouHaveAReferralCodeCheckboxSelected() 
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		Assert.assertEquals("true",signUpPage.doYouHaveAReferralCodeCheckBoxIsSelected());
		
	}	
	
	@Test(priority=16)
	public void checkcheckDoYouHaveAReferralCodeCheckboxNotSelected() 
	{
		Assert.assertEquals("false", signUpPage.doYouHaveAReferralCodeCheckBoxIsSelected());
		
	}	
	
	@Test(priority=17)
	public void checkReferralCodeFieldStatus() throws Exception 
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		Thread.sleep(2000);
		System.out.println(signUpPage.EnterYourReferralCodeTextFieldStaus());
		Assert.assertEquals(true, signUpPage.EnterYourReferralCodeTextFieldStaus());
		
	}	
	
	@Test(priority=18)
	public void checkReferralCodeFieldSupplyText() throws InterruptedException 
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		signUpPage.EnterYourReferralCodeTextFieldSupplyText("ENR100");
		Thread.sleep(2000);
		String referralCodeFieldText = signUpPage.EnterYourReferralCodeTextFieldGetText();
		Assert.assertEquals(referralCodeFieldText, "ENR100");
			
	}	

	@Test(priority=19)
	public void checkReferralCodeFieldIsBlank() 
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		String referralCodeFieldText = signUpPage.EnterYourReferralCodeTextFieldGetText();
		Assert.assertEquals(referralCodeFieldText, "Enter your referral code");
			
	}	
	
	@Test(priority=20)
	public void checkApplyButtonStatus()
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		signUpPage.EnterYourReferralCodeTextFieldSupplyText("ENR100");
		Assert.assertEquals(true, signUpPage.ApplyButtonStatus());
			
	}		
	
	@Test(priority=21)
	public void checkApplyButtonText()
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		signUpPage.EnterYourReferralCodeTextFieldSupplyText("ENR100");
		String ApplyButtonText = signUpPage.ApplyButtonText();
		Assert.assertEquals(ApplyButtonText, "APPLY");
			
	}		
	
	@Test(priority=22)
	public void checkApplyButtonClickMessage()
	{
		signUpPage.doYouHaveAReferralCodeCheckBoxStatusClick();
		signUpPage.EnterYourReferralCodeTextFieldSupplyText("ENR100");
		signUpPage.ApplyButtonClick();
		Assert.assertTrue(true);
			
	}	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();

    }
		
}