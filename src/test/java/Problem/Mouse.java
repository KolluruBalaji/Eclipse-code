package Problem;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 * driver.get("https://www.saucedemo.com/"); WebElement
		 * username=driver.findElement(By.id("user-name"));
		 * //driver.findElement(By.id("user-name")).sendKeys("Balaji"); Actions action
		 * =new Actions(driver); action.click(username).sendKeys("Balaji").perform();
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/buttons");
		 Actions action= new Actions(driver);
		 //1st way
		// action.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().perform();
		 //2nd way
		 WebElement element=driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		 action.doubleClick(element).perform();
		 //RightClick 
		 WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		 action.contextClick(rightClick).perform();
		 WebElement Clickme=driver.findElement(By.id("//button[contains(text(),'Click Me')]//following::div[2]"));
		 action.click(Clickme);
		 
		 
	}

}
