package ExtentReports2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotionswithExtentReports extends BaseTest {
	
	@Test(testName ="TestGoogle" , groups= {"smoke"})
	public void TestGoogle() throws Exception {
		driver.get("https://www.google.com/");
		extentTest.info("Navigated to  Google Url");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String ExpectedTitle="HYR Tutorials - Google Search";
		String actualTitle=driver.getTitle();
		driver.getTitle();
		assertEquals(ExpectedTitle, actualTitle,"title");
		
	}
	
	@Test(testName ="TestFacebook" ,groups= {"Regression","smoke"})
	public void TestFacebook() throws Exception {
		driver.get("https://www.facebook.com/");
		extentTest.info("Navigated to FaceBookUrl");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		SoftAssert softAssert=new SoftAssert();
		String ExpectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		softAssert.assertEquals(ExpectedTitle, actualTitle,"Title");
		
	}
	@Test(testName ="TestOrangeHrm" ,groups= {"sanity"})
	public void TestOrangeHrm() throws Exception {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		extentTest.info("Navigated to Orange HrmUrl");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin12");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		
	}
}
