package Problem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LactorTech {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kolluru.Balaji\\eclipse-workspace\\Badshaa\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		 * driver.navigate().to("https://demoqa.com/text-box");
		 * driver.manage().window().maximize(); 
		 * //ID element has been done here;
		 * driver.findElement(By.id("userName")).sendKeys("Balaji");
		 */
		
		
		/*
		 * driver.navigate().to("https://www.saucedemo.com/");
		 * driver.manage().window().maximize(); 
		 * //Name Element has been done here
		 * driver.findElement(By.name("user-name")).sendKeys("Balaji");
		 */
		/*
		 * driver.navigate().to("https://demoqa.com/radio-button");
		 * driver.manage().window().maximize(); //ClassName Element has been done here
		 * driver.findElement(By.className("custom-control-label")).click();
		 */
		/*
		 * driver.navigate().to("https://demoqa.com/links");
		 * driver.manage().window().maximize(); 
		 * //Links Element has been done here
		 * driver.findElement(By.linkText("Home")).click();
		 */
		/*
		 * driver.navigate().to("https://demoqa.com/links");
		 * driver.manage().window().maximize(); 
		 * //Partial Links Element has been done
		 * here driver.findElement(By.partialLinkText("No ")).click();
	
		 */
		/*
		 * driver.navigate().to("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 *  //TagName withId Element has been done here
		 * driver.findElement(By.cssSelector("input#user-name")).sendKeys("Balaji");
		 */
		/*
		 * driver.navigate().to("https://demoqa.com/text-box");
		 * driver.manage().window().maximize(); 
		 * //TagName Elementwith class name has been done
		 * driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Balaji");
		 * 
		 */
		/*
		 * driver.navigate().to("https:www.google.com");
		 * driver.manage().window().maximize();
		 *  //TagName Element has been done here
		 * driver.findElement(By.tagName("input")).sendKeys("Balaji");
		 */
		/*
		 * driver.navigate().to("https:www.google.com");
		 * driver.manage().window().maximize();
		 *  // Xpath Attribute = value Element has been done here
		 * driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Balaji");
		 */
		/*
		 * driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
		 * driver.manage().window().maximize(); //Name Element has been done here
		 * driver.findElement(By.xpath("//*[contains(@value,'LOGIN')]")).click();
		 */
		/*
		 driver.navigate().to("https://demoqa.com/text-box");
		 * driver.manage().window().maximize(); 
		 * //Copying Xpath from the Html
		 * driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Pandhii");
		 */
		driver.navigate().to("https://www.rpachallenge.com/");
		
		
		
		  driver.manage().window().maximize(); //initiating xpath from Starts-With
		  driver.findElement(By.id("userName")).sendKeys("Balaji");
		  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(
		  "Pandhii@123.com");
		  driver.findElement(By.id("currentAddress")).sendKeys("Kolluru");
		  driver.findElement(By.id("permanentAddress")).sendKeys("Tenali"); 
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		 
		 
		 
		/*
		 * // driver.findElement(By.xpath("//*[starts-with(@id,'submit')]")).click();
		 * driver.manage().window().maximize(); //initiating xpath from Starts-With
		 * driver.findElement(By.xpath(
		 * "////label[contains(text(),'Address')]//following::input")).
		 * sendKeys("1-128 near srinivasa hall kolluru");
		 */
	}
	

}
