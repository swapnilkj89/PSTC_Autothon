package com.monsanto.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.monsanto.base.TestBase;
import com.monsanto.pages.HomePage;
import com.monsanto.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String loginPageTitle = loginPage.checkPageTitle();
		Assert.assertEquals(loginPageTitle, "Enrich Salon - Hair, Skin & Beauty Salon");
	}
	
	@Test(priority=2)
	public void loginPageLabelTest(){
		String loginLabel = loginPage.checkLoginLabel();
		Assert.assertEquals(loginLabel, "Login");
	}
	
	@Test(priority=3)
	public void loginPageUserNameLabelTest(){
		String loginUserNameLabel = loginPage.checkUserNameLabel();
		Assert.assertEquals(loginUserNameLabel, "Username");
	}
	
	@Test(priority=4)
	public void loginPagePasswordLabelTest(){
		String loginPasswordLabel = loginPage.checkPasswordLabel();
		Assert.assertEquals(loginPasswordLabel, "Password");
	}
	
	@Test(priority=5)
	public void loginPageRemeberMeLabelTest(){
		String loginPageRememeberLabel = loginPage.checkRememeberMeLabel();
		Assert.assertEquals(loginPageRememeberLabel, "Remember Me");
	}
	
	@Test(priority=6)
	public void loginPageNotYetRegisteredLabelTest(){
		String loginPageNotYetRegisteredLabel = loginPage.checkNotRegisteredYetLabel();
		Assert.assertEquals(loginPageNotYetRegisteredLabel, "Not registered yet? Sign Up");
	}
	
	@Test(priority=7)
	
	public void clickOnLoginButton() {
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
