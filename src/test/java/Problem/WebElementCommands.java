package Problem;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\SeleniumBasic1\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
File source=driver.findElement(By.id("user-name")).getScreenshotAs(OutputType.FILE);
File dest = new File(".\\ScreenShots\\web.png");
 //org.openqa.selenium.io.FileHandler.copy(source, dest);
/*
 * String name = driver.findElement(By.id("userName")).getAccessibleName();
 * System.out.println(name);
 */
/*
 * String name=
 * driver.findElement(By.xpath("//*[@id=\"submit\"]")).getAriaRole();
 * System.out.println(name)
 */;

/*
 * String name= driver.findElement(By.
 * xpath("//div[contains(text(),'Do you like the site?')]//following::label[1]")
 * ).getAttribute("for"); System.out.println(name);
 */
/*
 * String name
 * =driver.findElement(By.id("submit")).getCssValue("background-color");
 * System.out.println(name);
 */
/*
 * String name =driver.findElement(By.id("currentAddress-label")).getText();
 * System.out.println(name);
 */
/*
 * Boolean name
 * =driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isEnabled();
 * System.out.println(name);
 *//*
	 * Boolean name =driver.findElement(By.
	 * xpath("//div[contains(text(),'Do you like the site?')]//following::input[3]")
	 * ).isEnabled(); System.out.println(name)
	 */
 /*river.findElement(By.xpath("//div[contains(text(),'Do you like the site?')]//following::label[1]")).click();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Boolean name= driver.findElement(By.xpath("//div[contains(text(),'Do you like the site?')]//following::input[1]")).isSelected();
 System.out.println(name);*/
	
	}
	

}
