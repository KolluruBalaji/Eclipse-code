package ScreenShotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.utility.TakeScreenShot;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShots {
	 static WebDriver driver;
	@BeforeMethod
	public void setup() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public static void tc1() {
		driver.findElement(By.name("q")).sendKeys("Balaji");
	Assert.assertTrue(false);
	}
	@Test 
	public void tc2() {
		Assert.assertTrue(true);
		
	}
		
	@AfterMethod
	public void TearDown(ITestResult result) {
		if(result.FAILURE==result.getStatus())
			TakeScreenShot.Screenshot(driver, result.getName());
		driver.quit();
	}

}
