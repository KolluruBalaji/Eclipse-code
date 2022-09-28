package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class chapter4  {
	@Test
	public void test() throws IOException {
		ExtentReports extentreport=new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark=new  ExtentSparkReporter(file);
		extentreport.attachReporter(spark);
		extentreport
		.createTest("Test1")
		.log(Status.INFO, "info1")
		.log(Status.INFO, "info2")
		.log(Status.PASS, "Pass")
		.log(Status.PASS, "pass")
		.log(Status.WARNING, "warning")
		.log(Status.WARNING, "warning")
		.log(Status.SKIP, "skip")
		.log(Status.FAIL, "fail");
		//Order follow the order otherwise it will fail
		//Fail
		//Skip
		//Warning
		//pass
		//Info
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File ("report.html").toURI());
		
	}
	
	
	
	
}
