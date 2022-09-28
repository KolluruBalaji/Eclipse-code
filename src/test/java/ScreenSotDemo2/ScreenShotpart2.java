package ScreenSotDemo2;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;



public class ScreenShotpart2 extends BaseClass {
	@Test
	public static void tc1() {
		driver.findElement(By.name("q")).sendKeys("Balaji");
	Assert.assertTrue(false);
	}
	@Test 
	public void tc2() {
		Assert.assertTrue(true);
		
	}

	
	public void TearDown() {
		
		driver.quit();
	}

}
