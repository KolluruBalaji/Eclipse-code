package Problem;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usingPoint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		WebElement userName=driver.findElement(By.id("user-name"));
		Point p= userName.getLocation();
		System.out.println(p.x);
		System.out.println(p.getX());
		Actions action=new Actions(driver);
		action.moveByOffset(p.getX(), p.getY()).click().sendKeys("Selenium").perform();
	
	}

}
