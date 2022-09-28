package Problem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\Badshaa\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//it will navigate the screen from one to other
		driver.navigate().to("https://demoqa.com/radio-button");
		//it will maximize the screen
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().forward();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		driver.manage().window().minimize(); 
		

	}

}
