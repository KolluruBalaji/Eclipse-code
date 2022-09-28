package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Chapter3  {
	@Test
	public void test() throws IOException {
		ExtentReports extentreport=new ExtentReports();
		//usingPath
	//	ExtentSparkReporter spark=new  ExtentSparkReporter("C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\Badshaa\\report.html");
		//using File 
		File file=new File("report.html");
		ExtentSparkReporter spark=new  ExtentSparkReporter(file);
		extentreport.attachReporter(spark);
		ExtentTest test1=extentreport.createTest("Test1");
		test1.pass("this is pass");
		ExtentTest test2=extentreport.createTest("Test2");
		test2.log(Status.FAIL,"this is Failed");
		extentreport.createTest("Test3").skip("thsi si Skipped");
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File ("report.html").toURI());
		
	}
	
	
	
	
}
