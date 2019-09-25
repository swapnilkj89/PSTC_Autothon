package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenderIdentityPage extends TestBase{
	
	
	
	public GenderIdentityPage() {
		
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
	
	public String createAnAccountLabel()
	{
	MobileElement CREATEANACCOUNTLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_app_bar_title\")");
	String CREATEANACCOUNTLABELText = CREATEANACCOUNTLABEL.getText();
	return CREATEANACCOUNTLABELText;
	}
	
	public String genderIdentityLabel()
	{
	MobileElement GENDERIDENTITYLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"What’s your gender identity?\")");
	String GENDERIDENTITYLABELText = GENDERIDENTITYLABEL.getText();
	return GENDERIDENTITYLABELText;
	}	
	
	public String selectYourOptionLabel()
	{
	MobileElement SELECTYOUROPTIONLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Select your option\")");
	String SELECTYOUROPTIONLABELText = SELECTYOUROPTIONLABEL.getText();
	return SELECTYOUROPTIONLABELText;
	}	
	
	public void maleClick()
	{
	MobileElement MALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_male\")");
	MALE.click();
	}
	
	public boolean maleIsEnabled()
	{
	MobileElement MALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_male\")");
	boolean MALEenabled = MALE.isEnabled();
	return MALEenabled;
	}	
	
	public String maleText()
	{
	MobileElement MALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_male\")");
	String MALEText = MALE.getText();
	return MALEText;
	}	
	
	public void femaleClick()
	{
	MobileElement FEMALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_female\")");
	FEMALE.click();
	}
	
	public boolean femaleIsEnabled()
	{
	MobileElement FEMALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_female\")");
	boolean FEMALEenabled = FEMALE.isEnabled();
	return FEMALEenabled;
	}	
	
	public String femaleText()
	{
	MobileElement FEMALE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_female\")");
	String FEMALEText = FEMALE.getText();
	return FEMALEText;
	}	
	
	public void otherClick()
	{
	MobileElement OTHER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_other\")");
	OTHER.click();
	}
	
	public boolean otherIsEnabled()
	{
	MobileElement OTHER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_other\")");
	boolean OTHERenabled = OTHER.isEnabled();
	return OTHERenabled;
	}	
	
	public String otherText()
	{
	MobileElement OTHER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/rb_gender_other\")");
	String OTHERText = OTHER.getText();
	return OTHERText;
	}	
	
	public void nextIconClick()
	{
	MobileElement NEXTICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_gender_next\")");
	NEXTICON.click();
	}
	
	public boolean nextIconIsEnabled()
	{
	MobileElement NEXTICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/btn_registration_gender_next\")");
	boolean NEXTICONenabled = NEXTICON.isEnabled();
	return NEXTICONenabled;
	}	
	
	
	public String inclinedTowardsLabel()
	{
	MobileElement INCLINEDTOWARDSLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_other_gender_question\")");
	String INCLINEDTOWARDSLABELText = INCLINEDTOWARDSLABEL.getText();
	return INCLINEDTOWARDSLABELText;
	}	
	
	public String maleButtonLabel()
	{
	MobileElement MALEBUTTONLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_other_gender_male\")");
	String MALEBUTTONLABELText = MALEBUTTONLABEL.getText();
	return MALEBUTTONLABELText;
	}
	
	public String femaleButtonLabel()
	{
	MobileElement FEMALEBUTTONLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/tv_other_gender_female\")");
	String FEMALEBUTTONLABELText = FEMALEBUTTONLABEL.getText();
	return FEMALEBUTTONLABELText;
	}	
	
	public void maleButtonClick()
	{
	MobileElement MALEBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/ll_other_gender_male\")");
	MALEBUTTON.click();
	}	
	
	public void femaleButtonClick()
	{
	MobileElement FEMALEBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/ll_other_gender_female\")");
	FEMALEBUTTON.click();
	}	
	
	public boolean maleHeartIconONButtonIsEnabled()
	{
	MobileElement MALEICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_other_gender_male\")");
	boolean MALEICONenabled = MALEICON.isEnabled();
	return MALEICONenabled;
	}	

	public boolean femaleHeartIconONButtonIsEnabled()
	{
	MobileElement FEMALEICON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.enrich.salonapp:id/iv_other_gender_female\")");
	boolean FEMALEICONenabled = FEMALEICON.isEnabled();
	return FEMALEICONenabled;
	}
	
	
	
	
}
