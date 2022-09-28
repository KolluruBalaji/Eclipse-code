package Problem;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\SeleniumBasic1\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> row =driver.findElements(By.tagName("tr"));
		System.out.println(" the number of rows is : "+ row.size());
		List<WebElement> col=driver.findElements(By.xpath("//thead//th"));
		System.out.println(" the number of columns is :"+col.size());
		//To Print a particular cell value  string Text
		 String text =driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
	        System.out.println(text);
	              
	      

	}
	

}
