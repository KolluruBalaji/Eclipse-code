package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter6 {
	 static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
	ExtentReports extentreport=new ExtentReports();
	File file=new File("report.html");
	ExtentSparkReporter spark=new  ExtentSparkReporter(file);
	extentreport.attachReporter(spark);
	
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String base64Code=Screenshot2();
	String path=Screenshot("Google.jpg");
	
	
	
	  extentreport.createTest("ScreenShot Test1"
	  ,"this is attaching to the ScreenShot to the test level")
	  .info("this is info msg") .addScreenCaptureFromBase64String(base64Code);
	  
	  extentreport.createTest("ScreenShot Test2"
	  ,"this is attaching to the ScreenShot to the test level")
	  .info("this is info msg")
	  .addScreenCaptureFromBase64String(base64Code,"Google homepage");
	 
	
	
	extentreport.createTest("ScreenShot Test3","this is attaching to the ScreenShot to the test level")
	.info("this is info msg")
	.addScreenCaptureFromPath(path);
	
	
	extentreport.createTest("ScreenShot Test4","this is attaching to the ScreenShot to the test level")
	.info("this is info msg")
	.addScreenCaptureFromPath(path, "Google homepage");
	
	extentreport.flush();
	driver.quit();
	Desktop.getDesktop().browse(new File ("report.html").toURI());
	
}
	

public static String  Screenshot2() {
	TakesScreenshot ts=(TakesScreenshot) driver;
	String base64Code=ts.getScreenshotAs(OutputType.BASE64);
	System.out.println("ScreeenShot Saved Sucessfully");
	return  base64Code;
}


public static String  Screenshot(String fileName) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".//ScreenShot//"+fileName);
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("ScreeenShot Saved Sucessfully");
	return  dest.getAbsolutePath();
}
}
