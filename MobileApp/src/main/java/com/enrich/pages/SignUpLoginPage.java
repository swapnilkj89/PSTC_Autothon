package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignUpLoginPage  extends TestBase{
	
	
	
	public SignUpLoginPage() {
		
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
	
	
	public String LoginLabel()
	{
	MobileElement LOGINLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_app_bar_title\")");
	String LABELText = LOGINLABEL.getText();
	return LABELText;
	}
	
	public boolean EnrichImageIsEnabled()
	{
	MobileElement ENRICHIMAGE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_login_mobile_image\")");
	boolean ENRICHIMAGEenabled = ENRICHIMAGE.isEnabled();
	return ENRICHIMAGEenabled;
	}	

	public String EnrichImageText()
	{
	MobileElement ENRICHIMAGETEXT = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_app_bar_title\")");
	String IMAGEText = ENRICHIMAGETEXT.getAttribute("content-desc");
	return IMAGEText;
	}

	public String YourMobileNumberLabel()
	{
	MobileElement YOURMOBILENUMBERLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Your Mobile Number\")");
	String YOURMOBILENUMBERLABELText = YOURMOBILENUMBERLABEL.getText();
	return YOURMOBILENUMBERLABELText;
	}
	
	public String PlusText()
	{
	MobileElement PLUSLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"+\")");
	String PLUSLABELLText = PLUSLABEL.getText();
	return PLUSLABELLText;
	}
	
	
	public String NineOneText()
	{
	MobileElement NINEONELABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"91\")");
	String NINEONELABELText = NINEONELABEL.getText();
	return NINEONELABELText;
	}
	
	public boolean EnterMobileNumberFieldIsEnabled()
	{
	MobileElement ENTERMOBILENUMBER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_login_mobile_number\")");
	boolean ENTERMOBILENUMBERenabled = ENTERMOBILENUMBER.isEnabled();
	return ENTERMOBILENUMBERenabled;
	}
	
	public void EnterMobileNumber(String number)
	{
	MobileElement ENTERMOBILENUMBER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_login_mobile_number\")");
	ENTERMOBILENUMBER.sendKeys(number);
	}	
	
	public String PROCEEDButtonText()
	{
	MobileElement PROCEEDButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"PROCEED\")");
	String PROCEEDButtonText = PROCEEDButton.getText();
	return PROCEEDButtonText;
	}	

	public boolean PROCEEDButtonStaus()
	{
	MobileElement PROCEEDButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"PROCEED\")");
	boolean PROCEEDButtonEnabled = PROCEEDButton.isEnabled();
	return PROCEEDButtonEnabled;
	}
	
	
	public void PROCEEDButtonClick()
	{
	MobileElement PROCEEDButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"PROCEED\")");
	PROCEEDButton.click();
	}
		
	public String FourDigitText()
	{
	MobileElement FOURDIGITLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"4 digit OTP will be sent to this number. \r\n" + 
			"Don’t worry, your number remains safe with us\")");
	String FOURDIGITLABELText = FOURDIGITLABEL.getText();
	return FOURDIGITLABELText;
	}	
	
		
}
