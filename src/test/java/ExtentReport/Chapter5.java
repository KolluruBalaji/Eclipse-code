package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter5  {
	@Test
	public void test() throws IOException {
		ExtentReports extentreport=new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark=new  ExtentSparkReporter(file);
		extentreport.attachReporter(spark);
		extentreport
		.createTest("Test1")
		.log(Status.INFO, "<b>info1</b>")
		.log(Status.INFO, "<i>info2</i>");
		String JasonData="{\"menu\": {  \r\n"
				+ "  \"id\": \"file\",  \r\n"
				+ "  \"value\": \"File\",  \r\n"
				+ "  \"popup\": {  \r\n"
				+ "    \"menuitem\": [  \r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateDoc()\"},  \r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},  \r\n"
				+ "      {\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}  \r\n"
				+ "    ]  \r\n"
				+ "  }  \r\n"
				+ "}}  ";
				
		String Xmldata="<menu id=\"file\" value=\"File\">  \r\n"
				+ "  <popup>  \r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateDoc()\" />  \r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />  \r\n"
				+ "    <menuitem value=\"Save\" onclick=\"SaveDoc()\" />  \r\n"
				+ "  </popup>  \r\n"
				+ "</menu>  ";
		List<String>listData=new ArrayList<>();
		listData.add("Balaji");
		listData.add("Kolluru");
		listData.add("Guntur");
		extentreport
		.createTest("List data")
		.info(MarkupHelper.createOrderedList(listData));
		
		
		Map<Integer,String>mapData =new HashMap<>();
		mapData.put(101,"Blajai");
		mapData.put(102,"Blaji");
		mapData.put(103,"Kolluru");
		extentreport
		.createTest("Map Test")
		.info(MarkupHelper.createOrderedList(mapData));
		
		
		
		
		Set<Integer>setData=mapData.keySet();
		extentreport
		.createTest("Set Test")
		.info(MarkupHelper.createOrderedList(setData));
		//Highlight Based Test
		extentreport
		.createTest("Highlight Test")
		.info(MarkupHelper.createLabel("this is highlight message ", ExtentColor.PURPLE));
		
		
		try {
			int i=5/0;
			
		} catch (Exception e) {
			extentreport
			.createTest("Exception Test")
			.fail(e);
						
			
		}
		Throwable  t=new RuntimeException("this is a custom exception");
		extentreport
		.createTest("Exception Test2")
		.fail(t);

		
		
		
	
		
		
		
		extentreport
		.createTest("Jason based test")
	
		.log(Status.INFO,MarkupHelper.createCodeBlock(JasonData,CodeLanguage.JSON));
		extentreport
		.createTest("Xml based test")
		.info(MarkupHelper.createCodeBlock(Xmldata,CodeLanguage.XML));
		
		
		
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File ("report.html").toURI());
		 
	}
	
	
	
	
}
