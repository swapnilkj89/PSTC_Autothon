package com.bmc.remedyforce.Helper.Selenize;


import com.bmc.remedyforce.Helper.propertyFileHandler.ReadWriteProperty;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webPageHandler {

	ReadWriteProperty readProperty = new ReadWriteProperty();
	//String  propertyfileread = new String();
	
	
	
	
	
	public WebDriver launchChrome() {
		WebDriver driver = null;
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\rfInstallAutomation\\RemedyforceAutoServices\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver(options);
		
		return driver;
		
	}
	
	public void waitfor(WebDriver driver, int waitforSecs) {
		driver.manage().timeouts().implicitlyWait(waitforSecs,TimeUnit.SECONDS);
		
	}
		
	// To Write on Text Field
	public void sendTextToField(WebDriver driver, String eXpath, String stringKeys, String propertFileName) {

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(readProperty.Read(propertFileName, eXpath))));
		driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath))).sendKeys(stringKeys);
		
	}
	
	public void clearTextField(WebDriver driver, String eXpath,String propertFileName) {

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(readProperty.Read(propertFileName, eXpath))));
		driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath))).clear();
		
	}
	
	
		public String getWebTitle(WebDriver driver) {

			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			return driver.getTitle();
			
		}
	
	public String getValueOfDropDown(WebDriver driver, String eXpath, String propertFileName) {

		
		Select select =  new Select(driver.findElement(By.xpath(readProperty.Read(propertFileName,eXpath ))));
		WebElement option = select.getFirstSelectedOption();
		
		return option.getText();

}
	
	public String getElementText(WebDriver driver, String eXpath, String propertFileName) {

		
		String elementText =  driver.findElement(By.xpath(readProperty.Read(propertFileName,eXpath ))).getText();
		
		
		return elementText;

}
	
	
	
public String getSourceName(WebDriver driver, String eXpath) {

		
	 return driver.findElement(By.xpath(eXpath)).getAttribute("src");
		
		
		
}
	
	
	public String getElementTextwithoutProp(WebDriver driver, String eXpath) {

		
		String elementText =  driver.findElement(By.xpath(eXpath)).getText();
		
		
		return elementText;

}


	public void clickAfterWait(WebDriver driver, String eXpath, String propertFileName) {

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(readProperty.Read(propertFileName, eXpath))));
		driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath))).click();
	}

	public void waitForElementClickable(WebDriver driver, String eXpath, String propertFileName) {

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(readProperty.Read(propertFileName, eXpath))));

	}

	public void waitForElementVisible(WebDriver driver, String eXpath, String propertFileName) {

		WebDriverWait wait = new WebDriverWait(driver, 300000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(readProperty.Read(propertFileName, eXpath))));

	}

	public boolean isElementPresent(WebDriver driver, String elementIsPresent, String propertFileName) {

		try {
			driver.findElement(By.xpath(readProperty.Read(propertFileName, elementIsPresent)));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean selectValueFromDropDown(WebDriver driver, String eXpath, String value,String propertFileName) {

		try {
			Select drpDwn = new Select(driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath))));
			drpDwn.selectByVisibleText(value);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public String getCurrentURL(WebDriver driver) {

		String url = null;
		String[] urlsplit;

		url = driver.getCurrentUrl();
		urlsplit = url.split("/");
		for (String a : urlsplit) {
			System.out.println(a);
			url = a;

		}
		// System.out.println("----->"+url);
		urlsplit = url.split("\\?");

		// System.out.println("---->"+ urlsplit[0]);
		return urlsplit[0];
	}

	public String getHrefAttribut(WebDriver driver, String xpath, String propertFileName) {

		return driver.findElement(By.xpath(readProperty.Read(propertFileName, xpath))).getAttribute("href");

	}
	
	
	public String getAttributeValue(WebDriver driver, String xpath,String attributeValue, String propertFileName) {

		return driver.findElement(By.xpath(readProperty.Read(propertFileName, xpath))).getAttribute(attributeValue);

	}
	

	public boolean selectallFromDropDown(WebDriver driver, String eXpath) {

		try {
			Select drpDwn = new Select(driver.findElement(By.xpath(eXpath)));
			List<WebElement> allOptions = drpDwn.getOptions();
			for (int i = 0; i < allOptions.size(); i++) {
				drpDwn.selectByIndex(i);
			}

			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public WebElement getfirstElementfromTheList(WebDriver driver, String elementList, String propertFileName) {

		List<WebElement> noOfElements = driver
				.findElements(By.xpath(readProperty.Read(propertFileName, elementList)));
		if (noOfElements.size() > 0) {
			WebElement r = noOfElements.get(0);
			return r;
		} else {
			return null;
		}

	}

	public int getlistSize(WebDriver driver, String elementList, String propertFileName) {

		List<WebElement> noOfElements = driver
				.findElements(By.xpath(readProperty.Read(propertFileName, elementList)));

		if (noOfElements.size() > 0) {

			return noOfElements.size();
		} else {
			return 0;
		}

	}
	
	
	
	
	
	public int getlistSizewithoutProp(WebDriver driver, String elementList) {

		List<WebElement> noOfElements = driver
				.findElements(By.xpath(elementList));

		if (noOfElements.size() > 0) {

			return noOfElements.size();
		} else {
			return 0;
		}

	}

	public String getSrcName(WebDriver driver, String eXpath, String propertFileName) {
		String srcName = null;

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(readProperty.Read(propertFileName, eXpath))));
		srcName = driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath)))
				.getAttribute("src");

		return srcName;
	}

	public void visualforcePageSetup(WebDriver driver, String dataToBeSetup, String lookupLink, String SitePageNamelink, String propertFileName){
		String mainWindow = driver.getWindowHandle();
		clickAfterWait(driver, lookupLink,propertFileName);
		String winHandle;
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> stringIterator = windowHandles.iterator();
		while (stringIterator.hasNext()) {
			winHandle = stringIterator.next();
			if (!mainWindow.equalsIgnoreCase(winHandle)) {
				driver.switchTo().window(winHandle);
				System.out.println("The title of the page is:" + driver.getTitle());
			}
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.switchTo().frame(
				driver.findElement(By.xpath(readProperty.Read(propertFileName, "lookupSearchWindow"))));
		driver.findElement(By.xpath(readProperty.Read(propertFileName, "SearchText")))
				.sendKeys(dataToBeSetup);
		clickAfterWait(driver, "LookupSearchGO",propertFileName);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		clickAfterWait(driver, SitePageNamelink,propertFileName);

		driver.switchTo().window(mainWindow);

	}

	public void markCheckBoxTrue(WebDriver driver, String eXpath, String propertFileName) {

		WebElement activeCheckboc = driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath)));
		boolean current = false;
		if (activeCheckboc.isDisplayed()) {
			if (activeCheckboc.isEnabled()) {
				current = activeCheckboc.isSelected();
				if (current != true) {
					activeCheckboc.click();
				}
			}
		}
	}

	public void acceptAlert(WebDriver driver) {

		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();

			driver.switchTo().defaultContent();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert is Present");
		}
	}
	
	public WebElement getWebPageElement(WebDriver driver, String eXpath, String propertFileName) {
		
		return driver.findElement(By.xpath(readProperty.Read(propertFileName, eXpath)));
		
	}
	
	public List<WebElement> getWebPageElementList(WebDriver driver, String eXpath, String propertFileName) {
	
	List<WebElement> w;
		
		w = driver.findElements(By.xpath(readProperty.Read(propertFileName, eXpath)));
		return w;
		
	}
	
	
	
	public void saveImage(String imageUrl) {
		URL url = null;
		try {
			url = new URL(imageUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String fileName = url.getFile();
		System.out.println("File NAme:"+fileName.substring(fileName.lastIndexOf("/")));
		
		String fNAme = fileName.substring(fileName.lastIndexOf("/"));
		fNAme.replace("/", "image");
		
		
		String[] parts = fNAme.split("jpg");
		String part1 = parts[0]; // 004
		
		System.out.println(part1);
		String destName = "C:\\rfInstallAutomation\\RemedyforceAutoServices\\Properties\\" + part1+"jpg";
		System.out.println(destName);
	 
		InputStream is = null;
		try {
			is = url.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream(destName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		byte[] b = new byte[2048];
		int length;
	 
		try {
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
