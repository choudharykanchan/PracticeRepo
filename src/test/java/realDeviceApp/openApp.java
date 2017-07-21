package realDeviceApp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class openApp {
	

	
		WebDriver driver;
		WebDriverWait wait;

		@BeforeTest
		public void setup() throws MalformedURLException {

			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "ZY223D9T4P");
			//capabilities.setCapability("deviceName", "ZY3222MGMB");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.whatsapp");
			capabilities.setCapability("appActivity", "com.whatsapp.Main");
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("fullReset", false);
		
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 5);
		}

		@Test
		public void testSearchAppium() {
	
			
		
			
		}

	 @AfterTest
		public void tearDown() {
			driver.quit();
		}
	}
