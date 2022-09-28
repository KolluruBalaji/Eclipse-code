package ExtentReports2;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static String  ScreeenShotSubFolderName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	@Parameters("browserName")
	@BeforeTest
	public void Setup(ITestContext context,@Optional("chrome") String browserName) {
		 switch (browserName.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
			     driver=new ChromeDriver();
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
				break;

			default:
				System.err.println("browser is invalid");
				break;
			}
		 driver.manage().window().maximize();
		 Capabilities capabilities= ( (RemoteWebDriver) driver).getCapabilities();
		String device=capabilities.getBrowserName()+" "+capabilities.getBrowserVersion();
		String author=context.getCurrentXmlTest().getParameter("author");
		 extentTest= extentReports.createTest(context.getName());
		 extentTest.assignAuthor(author);
		 extentTest.assignDevice(device);
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
		
	}
	@BeforeSuite
	public void intializeExtentReports() {
		ExtentSparkReporter Spark=new ExtentSparkReporter("AllTests.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(Spark);
		extentReports.setSystemInfo("Os",System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version",System.getProperty("java.version"));
	}
	
	@AfterSuite
	public void GenerateReport() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		
	}
	@AfterMethod
	public void CheckStatus( Method m,ITestResult result) throws Exception  {
		if(result.getStatus()==ITestResult.FAILURE) {
			String ScreeenShotPath=null;
			ScreeenShotPath =CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
			extentTest.addScreenCaptureFromPath(ScreeenShotPath);
			extentTest.fail(result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.pass(m.getName()+"is passed");
			
		}
		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
	}
	public String  CaptureScreenshot(String FileName) throws Exception {
		 
		 if(ScreeenShotSubFolderName==null) {
			 LocalDateTime myDateObj = LocalDateTime.now();
			    System.out.println("Before formatting: " + myDateObj);
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

			    ScreeenShotSubFolderName = myDateObj.format(myFormatObj);
			   
		 }
		 TakesScreenshot takeScreenShot=(TakesScreenshot) driver;
		 File src=takeScreenShot.getScreenshotAs(OutputType.FILE);
		//File dest=new File(".\\ScreenShots\\Logo.png");
			File dest=new File(".\\ScreenShot\\"+ScreeenShotSubFolderName+"/"+FileName);
			FileUtils.copyFile(src, dest);
			System.out.println("screenshot saved Sucessfully" );
			return FileName;
		
	 }

	}
