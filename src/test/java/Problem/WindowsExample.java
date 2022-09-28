package Problem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/met_win_prompt.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();
		 String Parent =driver.getWindowHandle();
		 String Child=driver.getWindowHandles().toArray()[1].toString();
		 driver.switchTo().window(Child);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		 
		
		

	}

}
