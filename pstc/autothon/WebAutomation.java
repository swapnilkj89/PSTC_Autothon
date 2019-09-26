package com.pstc.autothon;

import java.util.Iterator;
import java.util.List;

import org.apache.http.entity.mime.Header;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bmc.remedyforce.Helper.Selenize.webPageHandler;
import com.bmc.remedyforce.Helper.propertyFileHandler.PropertyFileEnums;

public class WebAutomation {
	
	webPageHandler autohelper;
	WebDriver chromeDriver;
	
	public WebAutomation() {
		// TODO Auto-generated constructor stub
		
		autohelper = new webPageHandler();
	
	
	
	
	}
	
	
	
	@AfterClass
	public void tierdown() {
		
		chromeDriver.quit();
		chromeDriver.close();;
	}
	
	
	
	@BeforeClass
	public void LaunchGoogle() {
		
		chromeDriver = autohelper.launchChrome();
		chromeDriver.get("http://www.google.com");
		
		AssertJUnit.assertEquals("true", autohelper.isElementPresent(chromeDriver, "googleSearchButton", PropertyFileEnums.propertyFileName.pstc.toString()));
		
		
	}	
	
	
	@Test
	public void Search() {
		
		autohelper.sendTextToField(chromeDriver, "googleSearchInput", "step-in forum facebook", PropertyFileEnums.propertyFileName.pstc.toString());
		
		autohelper.clickAfterWait(chromeDriver, "googleSearchButton", PropertyFileEnums.propertyFileName.pstc.toString());
		
		AssertJUnit.assertEquals("true", autohelper.isElementPresent(chromeDriver, "searchResult", PropertyFileEnums.propertyFileName.pstc.toString()));
		
	}
		
		
		
		
	@Test	
	public void facebookPage() {
		
		chromeDriver.get("https://www.facebook.com/STeP-IN-Forum-2063693617253588/posts");
			
		int numberofPost  = autohelper.getlistSize(chromeDriver, "numberofPost", PropertyFileEnums.propertyFileName.pstc.toString());
		
		for(int i = 1;i<=numberofPost;i++) {
			
			int j = 0;
			
			j = autohelper.getlistSizewithoutProp(chromeDriver, "(//div[@data-testid='post_message'])["+i+"]/following-sibling::div//div/a/div/img");
			
			if(j == 4) {
				
				
				String k;
				
				k = autohelper.getElementTextwithoutProp(chromeDriver, "((//div[@data-testid='post_message'])["+i+"]/following-sibling::div//div/a/div)[5]//div[contains(text(),'+')]");
				
				
				k.replace("+","");
				
				int numberofImage = Integer.parseInt(k);
				
				System.out.println("Total Image observed: " + numberofImage);
				
				
				for(int h = 1; h<5;h++) {
					
				System.out.println(autohelper.getSourceName(chromeDriver, "((//div[@data-testid='post_message'])["+i+"]/following-sibling::div//div/a/div/img)["+h+"]"));
				
				autohelper.saveImage(autohelper.getSourceName(chromeDriver, "((//div[@data-testid='post_message'])["+i+"]/following-sibling::div//div/a/div/img)["+h+"]"));
					
				}
					
				break;
				
			}
			
			
			
		}

		
		
	}
		
		

}
