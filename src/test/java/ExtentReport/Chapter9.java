package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter9 {
	@Test
	public void test() throws IOException {
		 WebDriverManager.chromedriver().setup(); 
		 WebDriver driver=new ChromeDriver();
		  Capabilities capabilities= ( (RemoteWebDriver) driver).getCapabilities();
		ExtentReports extentreport=new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark=new  ExtentSparkReporter(file);
		extentreport.setSystemInfo("Os",System.getProperty("os.name"));
		extentreport.setSystemInfo("Java Version",System.getProperty("java.version"));
		extentreport.setSystemInfo("Os",capabilities.getBrowserName()+capabilities.getBrowserVersion());
		extentreport.setSystemInfo("AppUrl","www.google.com");
		extentreport.setSystemInfo("UserNmae","kollurubalaji10@gmail.com");
		extentreport.setSystemInfo("password","12345");
		
		
		
		extentreport.attachReporter(spark);
		extentreport
		.createTest("Test1")
		.assignAuthor("Balaji")
		.assignCategory("Smoke")
		.assignDevice("Chrome 104")
		.pass("this is passed Tesst");
		extentreport
		.createTest("Test2")
		.assignAuthor("pankaj")
		.assignCategory("Sanity")
		.assignDevice("Edge 100")
		.fail("this is passed Tesst");
		//Multiple authors
		extentreport
		.createTest("Test3","Test description")
		.assignAuthor("Dilip","pankaj","Balaji")
		.assignCategory("Regression","Sanity")
		.assignDevice("Chrome 104","firefox 90")
		.pass("this is passed Tesst");
		
		extentreport.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File ("report.html").toURI());
		 
	}
	
	
	
	
}
