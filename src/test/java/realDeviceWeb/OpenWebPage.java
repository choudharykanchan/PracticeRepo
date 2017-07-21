package realDeviceWeb;

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

public class OpenWebPage {
	

	
		WebDriver driver;
		WebDriverWait wait;
		String AppURL = "https://www.facebook.com/";

		@BeforeTest
		public void setup() throws MalformedURLException {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("deviceName", "ZY223D9T4P");
			//capabilities.setCapability("deviceName", "ZY3222MGMB");
			capabilities.setCapability("platformName", "Android");
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 5);
		}

		@Test
		public void testSearchAppium() {
		
			driver.get(AppURL);
			

			WebElement emailId = driver.findElement(By.name("email"));
			emailId.sendKeys("kanchanc1992@gmail.com");

			WebElement pass = driver.findElement(By.id("u_0_2"));
			pass.sendKeys("kanchanc1992@gmail.com");

			WebElement loginButton = driver.findElement(By.id("u_0_6"));
			loginButton.click();
			
			
		}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}
	}
