package Problem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCertificate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		Options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(Options);
		driver.get("https://expired.badssl.com/");
		
		
		
		
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		EdgeOptions Options1=new EdgeOptions();
		Options1.setAcceptInsecureCerts(true);
		WebDriver edriver=new EdgeDriver(Options1);
		edriver.get("https://expired.badssl.com/");
	}
	

}
