package com.monsanto.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.monsanto.base.TestBase;

public class TestUtil extends TestBase{

	private static final long LIMIT = 0;
	public static long PAGE_LOAD_TIMEOUT =30;
	public static long IMPLICIT_WAIT = 20;
	 Actions actions;
	
	public void toPerformMouseHover(WebDriver driver, WebElement target) {
		
		actions = new Actions(driver);
		actions.moveToElement(target).build().perform();

	}
	
	public void explicitWaitForElements(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(element));
	
	}
	
	
public void pageDown(WebDriver driver) {
		
		actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();

	}


public void selectALLText(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.CONTROL+"a").build().perform();

}

public void pageUP(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_UP).build().perform();

}

public void pressDELKEY(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.DELETE).build().perform();

}

public void clearfield(WebElement element) {
	
	element.clear();

}

public void downArrowKey(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).build().perform();

}

public void enterKeyPress(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).build().perform();

}

public void ESCKeyPress(WebDriver driver) {
	
	actions = new Actions(driver);
	actions.sendKeys(Keys.ESCAPE).build().perform();

}

public void selectDropDown(WebElement element, Integer index) {
	Select select = new Select(element);
			select.selectByIndex(index);
	
}

public void javaScriptExecutor(WebElement element) {
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", element);

}

//Method to generate 10 digits unique number
public String uiqueID() {
	  // 10 digits.
	Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
     String strDate = dateFormat.format(date);  
    return strDate;
	}

public Integer dataCheckInTable(WebDriver driver, String brandUnitNameField) {
	
	List<WebElement> row = driver.findElements(By.xpath("//*[@class='ng-star-inserted']/td[1]"));
	int RowSize = row.size();
	//List<WebElement> col = driver.findElements(By.xpath("//tr[@class='ng-star-inserted']/th"));
	//int ColSize = col.size();
	String Before = "//*[@class='ui-table-scrollable-body-table']/tbody/tr[";
	String After = "]/td[2]";
	actions = new Actions(driver);
	//actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	int count=0;
	for (int row1=1; row1<=RowSize;row1++) 
	{
	
		
		String FinalXpath = Before+row1+After;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = driver.findElement(By.xpath(FinalXpath)).getText();
		if(text.equals(brandUnitNameField))
		{
			count++;
			
		}
		if (row1 == 6) 
		{			
		driver.findElement(By.xpath(FinalXpath)).click();
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();				
		}		
		
		if(count==1)
		{
			
			break;
			
		}
		
	
	}
	return count;
	
	
}

public int updateddataCheckInTable(WebDriver driver, String brandUnitNameField) throws InterruptedException {
	
	List<WebElement> row = driver.findElements(By.xpath("//*[@class='ng-star-inserted']/td[1]"));
	int RowSize = row.size();
	List<WebElement> col = driver.findElements(By.xpath("//tr[@class='ng-star-inserted']/th"));
	int ColSize = col.size();
	String Before = "//*[@class='ui-table-scrollable-body-table']/tbody/tr[";
	String After = "]/td[2]";
	//actions = new Actions(driver);
	//actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	int count=0;
	for (int row1=1; row1<=RowSize;row1++) 
	{
		int rowplusone = row1+1;
		
		String FinalXpath = Before+row1+After;
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath(FinalXpath)).getText();
		if(text.equals(brandUnitNameField))
		{
			System.out.println(row1);	
			String FInalXpathplusone = Before+row1+"]/td[3]/button[1]";
			driver.findElement(By.xpath(FInalXpathplusone)).click();
			count++;
		}
		if (row1 == 6) 
		{			
		driver.findElement(By.xpath(FinalXpath)).click();
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();				
		}		
		System.out.println(text);			
		
		if(count==1)
		{
			break;
		}
		

	}

return count;

}

public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	
	}
//Switch to Alert
public String switchToAlert(WebDriver driver)
{
	Alert alert = driver.switchTo().alert();
	return driver.getTitle();	
}

public String localDateFormaDDMMYYYY() 
{
LocalDate date = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
String datedata = (date.format(formatter));
return datedata; 
}

public String localDateFormaDDMMYYYYPlusOneYear() 
{
LocalDate date = LocalDate.now().plusYears(1);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
String datedata = (date.format(formatter));
return datedata; 
}

}

