package com.enrich.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.enrich.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage  extends TestBase{
	
	//Define locators related to page
	
	
		//@FindBy(xpath = "//*[@src='./assets/images/enrich_logo.svg']")
		//		WebElement LogoOnHomePage;

		
		
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}

		public void supplyTextUsername()
		{
		MobileElement USERNAME = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Username\")");
		USERNAME.sendKeys("rfadmin12@rf.com.dsb2");
		}
		
		public void supplyTextPassword()
		{
		MobileElement PASSWORD = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Password\")");
		PASSWORD.sendKeys("newuser@1");
		}

		public void signInButton()
		{
		MobileElement SIGNIN = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Log In to Sandbox\")");
		SIGNIN.click();
		}	
		
		public void IAgreeButton()
		{
		MobileElement IAGREE = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"I AGREE\")");
		IAGREE.click();
		}
		
		public void threeDotButton()
		{
		MobileElement ACTION = ((AndroidDriver<MobileElement>)driver).findElement(By.className("android.widget.ImageButton"));
		ACTION.click();
		}
		
		public void changeServer()
		{
		MobileElement CHANGESERVER = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Change Server\")");
		CHANGESERVER.click();
		}
		
		public void selectSandbox()
		{
		MobileElement SELECTSANDBOX = ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.RadioButton[contains(@text,'Sandbox')]"));
		SELECTSANDBOX.click();
		}	
		
		public void selectApply()
		{
		MobileElement SELECTAPPLY = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Apply\")");
		SELECTAPPLY.click();
		}
		
		public void selectAllow()
		{
		MobileElement SELECTALLOW = ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.Button[contains(@text,'Allow')]"));
		SELECTALLOW.click();
		}
		
		public void toggleSideBar()
		{
		MobileElement TOGGLESIDEBAR = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.salesforce.chatter:id/toolbar_navigation_icon\")");
		TOGGLESIDEBAR.click();
		}
		
		public void moreButtonClick()
		{
		MobileElement MOREBUTTON = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"More\")");
		MOREBUTTON.click();
		}
		
		public void incidentClick()
		{
		MobileElement INCIDENTS = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Incidents\")");
		INCIDENTS.click();
		}
		
		public void incidentNewClick()
		{
		MobileElement INCIDENTNEWCLICK = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"New\")");
		INCIDENTNEWCLICK.click();
		}
		
		public void searchClick()
		{
		MobileElement SEARCHCLICK = ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("(//android.view.View[contains(@text,'Search')])[1]"));
		SEARCHCLICK.click();
		}
		
		public void supplyPLATFORMInSearchTextField()
		{
		MobileElement SEARCHTEXTFIELD = ((AndroidDriver<MobileElement>)driver).findElement(By.className("android.widget.EditText"));
		SEARCHTEXTFIELD.sendKeys("platformclient");
		}
		
		public void clickOnSearchData()
		{
		MobileElement INCIDENTNEWCLICK = ((AndroidDriver<MobileElement>)driver).findElement(By.className("android.view.View"));
		INCIDENTNEWCLICK.click();
		}
		
		public void ClientDetailsLabelClick()
		{
		MobileElement ClientDetailsClick = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Client Details\")");
		ClientDetailsClick.click();
		}
		
		public void searchFieldCategoryClick()
		{
		MobileElement SEARCHCLICK = ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("(//android.view.View[contains(@text,'Search')])[3]"));
		SEARCHCLICK.click();
		}
		
		public void supplyHardwareTextField()
		{
		MobileElement SEARCHTEXTFIELD = ((AndroidDriver<MobileElement>)driver).findElement(By.className("android.widget.EditText"));
		SEARCHTEXTFIELD.sendKeys("Hardware");
		}
		
		public void incidentSaveButtonClick()
		{
		MobileElement SAVECLICK = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Save\")");
		SAVECLICK.click();
		}
		
		public void NewIncidentLabelClick()
		{
		MobileElement NEWINCIDENTLABEL = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Incident Details\")");
		NEWINCIDENTLABEL.click();
		}
		
}
