package com.enrich.pages;

import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class HomePage extends TestBase{
	
	//Define locators related to page
	
	
		//@FindBy(xpath = "//*[@src='./assets/images/enrich_logo.svg']")
		//		WebElement LogoOnHomePage;

		
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}

		public String signUpButtonText()
		{
		MobileElement SIGNUP = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Username\")");
		String SIGNUPbuttonText = SIGNUP.getText();
		return SIGNUPbuttonText;
		}
		
		public String bookAnAppointmentButtonText()
		{
		MobileElement BOOKANAPPOINTMENTbutton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"BOOK AN APPOINTMENT\")");
		String BOOKANAPPOINTMENTbuttonText = BOOKANAPPOINTMENTbutton.getText();
		return BOOKANAPPOINTMENTbuttonText;
		}		
		
		public String searchSalonButtonText()
		{
		MobileElement SEARCHSALON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SEARCH SALON\")");
		String SEARCHSALONbuttonText = SEARCHSALON.getText();
		return SEARCHSALONbuttonText;
		}
		
		public boolean signUpButtonStatus()
		{
		MobileElement SIGNUP = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SIGNUP\")");
		boolean SIGNUPbuttonStatus = SIGNUP.isEnabled();
		return SIGNUPbuttonStatus;
		}
		
		public boolean searchSalonButtonStatus()
		{
		MobileElement SEARCHSALON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SEARCH SALON\")");
		boolean SEARCHSALONbuttonStatus = SEARCHSALON.isEnabled();
		return SEARCHSALONbuttonStatus;
		}
		
		
		public SignUpPage signUpButtonClick()
		{
		MobileElement SIGNUP = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SIGNUP\")");
		SIGNUP.click();
		return new SignUpPage();
		
		}
		
		public void searchSalonButtonClick()
		{
		MobileElement SEARCHSALON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"SEARCH SALON\")");
		SEARCHSALON.click();
		}	
		
		public boolean bookAnAppointmentButtonStatus()
		{
		MobileElement BOOKANAPPOINTMENT = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"BOOK AN APPOINTMENT\")");
		boolean BOOKANAPPOINTMENTbuttonStatus = BOOKANAPPOINTMENT.isEnabled();
		return BOOKANAPPOINTMENTbuttonStatus;
		}
		
		public BookAnAppointmentPage bookAnAppointmentButtonClick()
		{
		MobileElement BOOKANAPPOINTMENTbuttonStatus = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"BOOK AN APPOINTMENT\")");
		BOOKANAPPOINTMENTbuttonStatus.click();
		return new BookAnAppointmentPage();
		}
	
		
		
	}
