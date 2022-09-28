package StaticWebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable1 extends BaseClass{
	@Test(priority=1)
	public void getTableHeaders() {
		Setup();
		System.out.println("==========table headers===========");
		driver.manage().window().maximize();
		List<WebElement> allHeadertable=driver.findElements(By.xpath("//table//tbody/tr/th"));
		System.out.println("Headers are in table below");
		System.out.println("total headers found:"+allHeadertable.size());
		for(WebElement header:allHeadertable) {
			System.out.println(header.getText());
		}
		System.out.println("===================================");
		
	}
	
	@Test(priority=2)
	public void  CandR() {
		Setup();
		System.out.println("==============cols and Rows================");
		 Rows =driver.findElements(By.xpath("//table//tbody//tr"));
		 cols=driver.findElements(By.xpath("//table//tbody//tr//th"));
		System.out.println("The Rows are:"+Rows.size());
		System.out.println("Th cols are:"+cols.size());
		
		
	}
	@Test(priority=3)
	public void CousePosition() {
		Setup();
		System.out.println("===Geyt all couse Names of "+CourseRole+" position");
		for(int i=0;i<Rows.size();i++) {
			WebElement Position =driver.findElement(By.xpath("//table//tbody//tr//["+i+"]//td["+corsePosition+"]"));
			if(Position.getText().toLowerCase().equalsIgnoreCase(CourseRole)) {
				WebElement Author=driver.findElement(By.xpath("//table//tbody//tr//["+i+"]//td["+CouseName+"]"));
				System.out.println(Author.getText());
			}
			System.out.println("========================");
		}
	}

}




