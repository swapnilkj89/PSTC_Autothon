package com.enrich.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.enrich.util.StoreData;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static FileReader fileReader;
	public static Properties prop;
	public static AndroidDriver<MobileElement>  driver;

		
		public TestBase() {
			
			try {
				File file = new File("C:\\GIT\\MobileApp[5280]\\MobileApp\\src\\main\\java\\com\\enrich\\config\\config.properties");
				fileReader = new FileReader(file);
				prop = new Properties();
				try {
					prop.load(fileReader);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public static void initialization() throws Exception
		{
			//Setting Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,StoreData.deviceName);
			caps.setCapability(MobileCapabilityType.UDID,StoreData.udid);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,StoreData.platformName);
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,StoreData.platformVersion);
			caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,StoreData.appPackage);
			caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,StoreData.appActivity);
			caps.setCapability(MobileCapabilityType.NO_RESET,StoreData.noReset);
			try {
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(5000);
			
			
		}

	
}
