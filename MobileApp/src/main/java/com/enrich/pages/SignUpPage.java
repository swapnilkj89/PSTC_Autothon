package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignUpPage extends TestBase{
	
	
		
		public SignUpPage() {
			
			PageFactory.initElements(driver, this);
		}

		public void crossIconClick()
		{
		MobileElement CROSSICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_signup_close\")");
		CROSSICON.click();
		}
		
		public boolean crossIconStatus()
		{
		MobileElement CROSSICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_signup_close\")");
		return CROSSICON.isEnabled();
		}
		
		public String loginButtonText()
		{
		MobileElement LOGINButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"LOGIN\")");
		String SEARCHSALONbuttonText = LOGINButton.getText();
		return SEARCHSALONbuttonText;
		}		
		
		public boolean loginButtonStatus()
		{
		MobileElement LOGINButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"LOGIN\")");
		boolean SEARCHSALONbuttonStatus = LOGINButton.isEnabled();
		return SEARCHSALONbuttonStatus;
		}	
		
		public void loginButtonClick()
		{
		MobileElement LOGINButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"LOGIN\")");
		LOGINButton.click();

		}
		
		public boolean nextArrowStatus()
		{
		MobileElement NEXTARROW = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_registration_next_arrow\")");
		boolean NEXTARROWStatus = NEXTARROW.isEnabled();
		return NEXTARROWStatus;
		}			
		
		public boolean enrichImageStatus()
		{
		MobileElement eNRICHIMAGE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_registration_enrich_logo\")");
		boolean eNRICHIMAGEStatus = eNRICHIMAGE.isEnabled();
		return eNRICHIMAGEStatus;
		}		
		
		public String faceBookButtonText()
		{
		MobileElement CONNECTWITHFACEBOOKButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH FACEBOOK\")");
		String CONNECTWITHFACEBOOKButtonText = CONNECTWITHFACEBOOKButton.getText();
		return CONNECTWITHFACEBOOKButtonText;
		}
		
		public boolean faceBookButtonStatus()
		{
		MobileElement CONNECTWITHFACEBOOKButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH FACEBOOK\")");
		boolean CONNECTWITHFACEBOOKButtonStatus = CONNECTWITHFACEBOOKButton.isEnabled();
		return CONNECTWITHFACEBOOKButtonStatus;
		}
		
		public void faceBookButtonClick()
		{
		MobileElement CONNECTWITHFACEBOOKButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH FACEBOOK\")");
		CONNECTWITHFACEBOOKButton.click();
		}
				
		public String googleButtonText()
		{
		MobileElement CONNECTWITHGOOGLEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH GOOGLE\")");
		String CONNECTWITHGOOGLEButtonText = CONNECTWITHGOOGLEButton.getText();
		return CONNECTWITHGOOGLEButtonText;
		}
		
		public boolean googleButtonStatus()
		{
		MobileElement CONNECTWITHGOOGLEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH GOOGLE\")");
		boolean CONNECTWITHGOOGLEButtonStatus = CONNECTWITHGOOGLEButton.isEnabled();
		return CONNECTWITHGOOGLEButtonStatus;
		}
		
		public void googleButtonClick()
		{
		MobileElement CONNECTWITHGOOGLEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH GOOGLE\")");
		CONNECTWITHGOOGLEButton.click();
		}		
		
		public String connectWithEmailButtonText()
		{
		MobileElement CONNECTWITHEMAILButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH EMAIL\")");
		String CONNECTWITHEMAILButtonText = CONNECTWITHEMAILButton.getText();
		return CONNECTWITHEMAILButtonText;
		}
		
		public boolean connectWithEmailButtonStatus()
		{
		MobileElement CONNECTWITHEMAILButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH EMAIL\")");
		boolean CONNECTWITHEMAILButtonStatus = CONNECTWITHEMAILButton.isEnabled();
		return CONNECTWITHEMAILButtonStatus;
		}
		
		public void connectWithEmailButtonClick()
		{
		MobileElement CONNECTWITHEMAILButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CONNECT WITH EMAIL\")");
		CONNECTWITHEMAILButton.click();
		}	
		
		public String doYouHaveAReferralCodeCheckBoxText()
		{
		MobileElement doYouHaveAReferralCodeCheckBox = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Do you have a referral code?\")");
		String doYouHaveAReferralCodeCheckBoxText = doYouHaveAReferralCodeCheckBox.getText();
		return doYouHaveAReferralCodeCheckBoxText;
		}
		
		
		public boolean doYouHaveAReferralCodeCheckBoxStaus()
		{
		MobileElement doYouHaveAReferralCodeCheckBox = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Do you have a referral code?\")");
		boolean doYouHaveAReferralCodeCheckBoxStatus = doYouHaveAReferralCodeCheckBox.isEnabled();
		return doYouHaveAReferralCodeCheckBoxStatus;
		}		
		
		public void doYouHaveAReferralCodeCheckBoxStatusClick()
		{
		MobileElement doYouHaveAReferralCodeCheckBox = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Do you have a referral code?\")");
		doYouHaveAReferralCodeCheckBox.click();
		}	
		
		public String doYouHaveAReferralCodeCheckBoxIsSelected()
		{
		MobileElement doYouHaveAReferralCodeCheckBox = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Do you have a referral code?\")");
		return doYouHaveAReferralCodeCheckBox.getAttribute("checked");
		}
		
		public String EnterYourReferralCodeTextFieldText()
		{
		MobileElement EnterYourReferralCodeTextField = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_referral_code\")");
		String EnterYourReferralCodeTextFieldText = EnterYourReferralCodeTextField.getText();
		return EnterYourReferralCodeTextFieldText;
		}
		
		
		public boolean EnterYourReferralCodeTextFieldStaus()
		{
		MobileElement EnterYourReferralCodeTextField = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_referral_code\")");
		boolean EnterYourReferralCodeTextFieldStatus = EnterYourReferralCodeTextField.isEnabled();
		return EnterYourReferralCodeTextFieldStatus;
		}		
		
		public void EnterYourReferralCodeTextFieldSupplyText(String referralCode)
		{
		MobileElement EnterYourReferralCodeTextField = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_referral_code\")");
		EnterYourReferralCodeTextField.sendKeys(referralCode);
		}		

		public String EnterYourReferralCodeTextFieldGetText()
		{
		MobileElement EnterYourReferralCodeTextField = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_referral_code\")");
		return EnterYourReferralCodeTextField.getText();
		}
		
		public String ApplyButtonText()
		{
		MobileElement APPLYButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"APPLY\")");
		String APPLYButtonText = APPLYButton.getText();
		return APPLYButtonText;
		}
		
		public boolean ApplyButtonStatus()
		{
		MobileElement APPLYButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"APPLY\")");
		boolean APPLYButtonStatus = APPLYButton.isEnabled();
		return APPLYButtonStatus;
		}
		
		public void ApplyButtonClick()
		{
		MobileElement APPLYButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"APPLY\")");
		APPLYButton.click();
		}		
		

	}
