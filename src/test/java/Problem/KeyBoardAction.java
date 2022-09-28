package Problem;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		//driver.findElement(By.id("user-name")).sendKeys("Balaji");
		Actions action =new Actions(driver);
		action.click(username).sendKeys("Balaji").sendKeys(Keys.TAB).sendKeys("Balu@123").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	}

}
