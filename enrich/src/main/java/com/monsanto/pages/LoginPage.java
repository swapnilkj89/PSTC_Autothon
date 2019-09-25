package com.monsanto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.monsanto.base.TestBase;

public class LoginPage extends TestBase{
	
	//Define locators and methods related to page
	//Label Name locators 
	
	@FindBy(xpath = "//h4[text()='Login']")
	WebElement LoginLabel;
	
	@FindBy(xpath = "//*[text()='Username']")
	@CacheLookup
	WebElement UsernameLabel;
	
	@FindBy(xpath = "//*[text()='Password']")
	WebElement PasswordLabel;
	
	@FindBy(xpath = "//*[text()='Forgot Password?']")
	WebElement ForgotPasswordURL;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	WebElement RememeberMeCheckbox;
	
	@FindBy(xpath = "//*[text()=' Remember Me ']")
	WebElement RememeberMeLabel;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//*[@class='not-registered-yet center-block']")
	WebElement NotRegisteredYetLabel;
	
	@FindBy(xpath = "//*[text()='Sign Up']")
	WebElement SignUpURL;
	
	@FindBy(xpath = "//*[@type = 'username']")
	WebElement UserNameField;
	
	@FindBy(xpath = "//*[@type = 'password']")
	WebElement PasswordField;
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	//Method to check Login Label
		public String checkLoginLabel() {
			return LoginLabel.getText();
			
		}
	
	//Method to check UserName Label
	public String checkUserNameLabel() {
		return UsernameLabel.getText();
		
	}
	
	//Method to check Password Label
	public String checkPasswordLabel() {
		return PasswordLabel.getText();
		
	}
	//Method to check RememeberMeLabel
	public String checkRememeberMeLabel() {
		return RememeberMeLabel.getText();
		
	}
	//Method to check NotRegisteredYetLabel
	public String checkNotRegisteredYetLabel() {
		return NotRegisteredYetLabel.getText();
		
	}
	
	//Method to check PageTitle
		public String checkPageTitle() {
			return driver.getTitle();
	}
		
		public HomePage login(String un, String pwd){
			UserNameField.sendKeys(un);
			PasswordField.sendKeys(pwd);
			LoginButton.click();			    	
			return new HomePage();
		}
		
}
