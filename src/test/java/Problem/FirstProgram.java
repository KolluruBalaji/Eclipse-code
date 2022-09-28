package Problem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\SeleniumBasic1\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.selenium.dev/downloads/");
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
