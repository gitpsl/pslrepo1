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
 
public class Test01 extends Testngclass{
 
	@Test(description="Test Bmi Calculator")
	public void testBmiCalculator() throws InterruptedException {
		WebElement height = driver.findElement(By.
				name("heightCMS"));
		height.click();
        height.clear();
		height.sendKeys("181");

		WebElement weight = driver.findElement(By.
				name("weightKg"));
		weight.click();
		 weight.clear();
		weight.sendKeys("80");
		WebElement calculateButton = driver.findElement(By.
				id("Calculate"));
		calculateButton.click();

		try {
			
			WebElement bmi = driver.findElement(By.
					 name("bmi"));
			assertEquals(bmi.getAttribute("value"),"24.4");

			WebElement bmi_category = driver.findElement(By.name("bmi_category"));
			assertEquals(bmi_category.getAttribute("value"),"Normal");

		} catch (Error e) {

			//Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
		}
	 }
		
}