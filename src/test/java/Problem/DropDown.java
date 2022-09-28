package Problem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//ctrl+shift+o;
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		  WebElement element =driver.findElement(By.id("searchDropdownBox")); 
		
		  Select dropdown=new Select(element); 
		//  dropdown.selectByIndex(1);
		//  dropdown.selectByValue("search-alias=automotive-intl-ship");
		//  dropdown.selectByVisibleText("Computers");
		  List<WebElement> dropdownlist=dropdown.getOptions();
		  for(WebElement element1 : dropdownlist) {
			 if(element1.getText().equals("Books")){
				 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cprogramming");
				 driver.findElement(By.id("nav-search-submit-button")).click();
				 
				 
				 
				 
			 }
			 else {
				 System.out.println("No search options available in the dropdown");
			
			  
		  }
		 
		  }
		
	}
	}


