package EmulatorWeb;

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

public class EmulatorWeb {
	

	
		WebDriver driver;
		WebDriverWait wait;
		//String AppURL = "https://www.facebook.com/";

		@BeforeTest
		public void setup() throws MalformedURLException {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("deviceName", "ZY223D9T4P");
			//capabilities.setCapability("deviceName", "ZY3222MGMB");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.android.calculator2");
			capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 5);
		}

		@Test
		public void testSearchAppium() {
		
			//driver.get(AppURL);
			

			WebElement button1 = driver.findElement(By.xpath("//android.widget.Button[@text='1']"));
			button1.click();
			WebElement buttonPlus = driver.findElement(By.xpath("//android.widget.Button[@text='+']"));
			buttonPlus.click();
			WebElement button5 = driver.findElement(By.xpath("//android.widget.Button[@text='5']"));
			button5.click();
			
			 String result = driver.findElement(By.className("android.widget.TextView")).getText();
			 System.out.println("Number sum result is : " + result);
			
			
			
		}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}
	}

