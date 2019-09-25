package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OTPVerificationPage extends TestBase{
	
	
	
	public OTPVerificationPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void backIconClick()
	{
	MobileElement BACKICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_app_bar_back_close\")");
	BACKICON.click();
	}
	
	public boolean backIconIsEnabled()
	{
	MobileElement BACKICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_app_bar_back_close\")");
	boolean BACKICONenabled = BACKICON.isEnabled();
	return BACKICONenabled;
	}
	
	
	public String OTPLabel()
	{
	MobileElement OTPLabel = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_app_bar_title\")");
	String OTPLabelText = OTPLabel.getText();
	return OTPLabelText;
	}
	
	public boolean EnrichImageIsEnabled()
	{
	MobileElement ENRICHIMAGE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_login_mobile_image\")");
	boolean ENRICHIMAGEenabled = ENRICHIMAGE.isEnabled();
	return ENRICHIMAGEenabled;
	}	

	public String EnrichImageText()
	{
	MobileElement ENRICHIMAGETEXT = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_login_mobile_image\")");
	String IMAGEText = ENRICHIMAGETEXT.getAttribute("content-desc");
	return IMAGEText;
	}

	public String FourDigitOTPText()
	{
	MobileElement FourDigitOTPTextLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"4 digit OTP has been sent to your number\")");
	String FourDigitOTPText = FourDigitOTPTextLABEL.getText();
	return FourDigitOTPText;
	}
	
	public String SuppliedPhoneNumberText()
	{
	MobileElement SUPPLIEDPHONENUMBERLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_login_mobile_number\")");
	String SUPPLIEDPHONENUMBERLABELText = SUPPLIEDPHONENUMBERLABEL.getText();
	return SUPPLIEDPHONENUMBERLABELText;
	}
	
	public String CHANGEButtonText()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CHANGE\")");
	String CHANGEButtonText = CHANGEButton.getText();
	return CHANGEButtonText;
	}	

	public boolean CHANGEButtonStaus()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CHANGE\")");
	boolean CHANGEButtonEnabled = CHANGEButton.isEnabled();
	return CHANGEButtonEnabled;
	}
	
	
	public void CHANGEButtonClick()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CHANGE\")");
	CHANGEButton.click();
	}
	
	public String FetchingOTPLabel()
	{
	MobileElement FETCHINGOTPLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"com.enrich.salonapp:id/tv_login_otp_time_remaining\")");
	String FETCHINGOTPLABELText = FETCHINGOTPLABEL.getText();
	return FETCHINGOTPLABELText;
	}
		
	public String FetchingOTPValue()
	{
	MobileElement FETCHINGOTPVALUE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"com.enrich.salonapp:id/et_login_otp\")");
	String FETCHINGOTPVALUEText = FETCHINGOTPVALUE.getText();
	return FETCHINGOTPVALUEText;
	}	
	
	public String SUBMITButtonText()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SUBMIT\")");
	String CHANGEButtonText = CHANGEButton.getText();
	return CHANGEButtonText;
	}	

	public boolean SUBMITButtonStaus()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SUBMIT\")");
	boolean CHANGEButtonEnabled = CHANGEButton.isEnabled();
	return CHANGEButtonEnabled;
	}
	
	
	public void SUBMITButtonClick()
	{
	MobileElement CHANGEButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SUBMIT\")");
	CHANGEButton.click();
	}	
	
	
	public String RESENDCODELinkText()
	{
	MobileElement RESENDCODELink = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"RESEND CODE\")");
	String RESENDCODELinkText = RESENDCODELink.getText();
	return RESENDCODELinkText;
	}	

	public boolean RESENDCODEStaus()
	{
	MobileElement RESENDCODELink = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"RESEND CODE\")");
	boolean RESENDCODELinkEnabled = RESENDCODELink.isEnabled();
	return RESENDCODELinkEnabled;
	}
	
	
	public void RESENDCODEClick()
	{
	MobileElement RESENDCODELink = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"RESEND CODE\")");
	RESENDCODELink.click();
	}	
		
}
