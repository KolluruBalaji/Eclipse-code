package Problem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DragandDrop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/droppable");
		 Actions action=new Actions(driver);
		 WebElement drag =driver.findElement(By.id("draggable"));
		 WebElement drop=driver.findElement(By.id("droppable"));
		 action.dragAndDrop(drag, drop).build().perform();
		 

}
}
