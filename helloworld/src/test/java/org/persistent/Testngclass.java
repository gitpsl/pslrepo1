package org.persistent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;


public class Testngclass {
	
	WebDriver driver = null;
	 protected StringBuffer verificationErrors = new StringBuffer();

	 @Parameters({ "platform","browser","version", "url" })
	 @BeforeTest(alwaysRun=true)
	 
	 public void setup(String platform, String browser, String version,
			 String url) throws MalformedURLException
	// public void setup() throws MalformedURLException
	 {
		 
		// String platform="Windows",version="9",url="http://dl.dropbox.com/u/55228056/bmicalculator.html",browser="Internet Explorer";
		 
		 DesiredCapabilities caps = new DesiredCapabilities();

		 //Platforms
		 if(platform.equalsIgnoreCase("Windows"))
			 caps.setPlatform(org.openqa.selenium.Platform.
					 WINDOWS);
		 else if(platform.equalsIgnoreCase("Linux"))
			 caps.setPlatform(org.openqa.selenium.Platform.
					 LINUX);
		 //Version
		 caps.setVersion(version);
		 caps.setBrowserName(browser);
		 driver = new RemoteWebDriver(new URL("http://10.77.35.70:4444/wd/hub"), caps);

		 // Open the BMI Calculator Application
		 driver.get(url);

	 }	 
}
