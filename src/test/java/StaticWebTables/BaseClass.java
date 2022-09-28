package StaticWebTables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public WebDriver driver;
	List<WebElement> Rows;
	List<WebElement> cols;
	String CourseRole="Javascript";
int corsePosition=3;
int CouseName=2;
	
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().window().maximize();
		
	}	
		
		
	@AfterClass
	public void  tearDown() {
		driver.quit();
		
	}

}
