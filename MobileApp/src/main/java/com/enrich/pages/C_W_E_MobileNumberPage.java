package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class C_W_E_MobileNumberPage  extends TestBase{
	
	public C_W_E_MobileNumberPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void backIconButtonClick()
	{
	MobileElement BACKICONBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_app_bar_back_close\")");
	BACKICONBUTTON.click();
	}
	
	public boolean backIconButtonStatus()
	{
	MobileElement BACKICONBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_app_bar_back_close\")");
	return BACKICONBUTTON.isEnabled();
	}

	public String createAnAccountText()
	{
	MobileElement CREATEANACCOUNT = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Create an Account\")");
	String CREATEANACCOUNTTEXT = CREATEANACCOUNT.getText();
	return CREATEANACCOUNTTEXT;
	}

	public String WhatsYourMobileNumberLabel()
	{
	MobileElement YOURMOBILENUMBERLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"What’s your mobile number?\")");
	String YOURMOBILENUMBERLABELText = YOURMOBILENUMBERLABEL.getText();
	return YOURMOBILENUMBERLABELText;
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

	public boolean ArrowButtonStaus()
	{
	MobileElement ArrowButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_mobile_number_next\")");
	boolean ArrowButtonEnabled = ArrowButton.isEnabled();
	return ArrowButtonEnabled;
	}
	
	
	public void ArrowButtonClick()
	{
	MobileElement ArrowButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_mobile_number_next\")");
	ArrowButton.click();
	}
	
}
