package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreateAnAccountName extends TestBase{
	
	public CreateAnAccountName() {
		
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
	
	
	public String whatsYournameText()
	{
	MobileElement WHATSYOURNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"What’s your name?\")");
	String WHATSYOURNAMETEXT = WHATSYOURNAME.getText();
	return WHATSYOURNAMETEXT;
	}
	
	public String firstNameText()
	{
	MobileElement FIRSTNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"First Name\")");
	String FIRSTNAMETEXT = FIRSTNAME.getText();
	return FIRSTNAMETEXT;
	}	
	
	public String lastNameText()
	{
	MobileElement LASTNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Last Name\")");
	String LASTNAMETEXT = LASTNAME.getText();
	return LASTNAMETEXT;
	}	
	
	public void firstNameTextField(String fname)
	{
	MobileElement FIRSTNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_first_name\")");
	FIRSTNAME.sendKeys(fname);
	}	
	
	public void lastNameTextField(String lname)
	{
	MobileElement LASTNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/et_registration_last_name\")");
	LASTNAME.sendKeys(lname);
	}	
	
	public void nextIconButtonClick()
	{
	MobileElement NEXTICONBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_full_name_next\")");
	NEXTICONBUTTON.click();
	}
	
	public boolean nextIconButtonStatus()
	{
	MobileElement NEXTICONBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_full_name_next\")");
	return NEXTICONBUTTON.isEnabled();
	}	
	
}
