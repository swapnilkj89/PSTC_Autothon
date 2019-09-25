package com.enrich.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.enrich.base.TestBase;
import com.enrich.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	//ExtentReports extent;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException 
	 {
		try {
			initialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage = new HomePage();
	 }
	
	//Checking SIGNUP button Text
	@Test(priority=1)
	public void checkSignUPButtonText()
	{
		System.out.println(homePage.signUpButtonText());
		Assert.assertEquals("SIGNUP", homePage.signUpButtonText());
		
	}
	
	//Checking SEARCH SALON button Text
	@Test(priority=2)
	public void checkSearchSalonButtonText()
	{
		Assert.assertEquals("SEARCH SALON", homePage.searchSalonButtonText());
		
	}
	
	//Checking SignUp Button Status
	@Test(priority=3)
	public void checkSignUPButtonStatus()
	{
		Assert.assertEquals(true, homePage.signUpButtonStatus());
		
	}
	
	//Checking SEARCH SALON Button Status
	@Test(priority=4)
	public void checkSearchSalonButtonStatus()
	{
		Assert.assertEquals(true, homePage.searchSalonButtonStatus());
		
	}
	
	//Clicking on SIGNUP button
	@Test(priority=5)
	public void clickOnSignUPButton()
	{
		homePage.signUpButtonClick();
		Assert.assertEquals(true, true);
		
	}
	
	//Clicking on SEARCH SALON Button
	@Test(priority=6)
	public void clickOnSearchSalonButton()
	{
		homePage.searchSalonButtonClick();
		Assert.assertTrue(true);
	}
		
	@Test(priority=7)
	public void checkBookAnAppointmentButtonStatus()
	{
		Assert.assertEquals(true, homePage.bookAnAppointmentButtonStatus());
		
	}
	
	//Clicking on BookAnAppointment button
	@Test(priority=8)
	public void clickOnBookAnAppointmentButton()
	{
		homePage.bookAnAppointmentButtonClick();
		Assert.assertEquals(true, true);
		
	}	
	
	@Test(priority=9)
	public void checkBookAnAppointmentButtonText()
	{
		Assert.assertEquals("BOOK AN APPOINTMENT", homePage.bookAnAppointmentButtonText());
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();

    }
}
