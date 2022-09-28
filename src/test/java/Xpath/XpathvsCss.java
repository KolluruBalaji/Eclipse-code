package Xpath;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathvsCss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.oracle.com/in/cloud/sign-in.html");
		
		//StartTine 
		Instant startTime=Instant.now();
		System.out.println(startTime.toString());
		//driver.findElement( By.xpath("//input[@name='rc63input']")).sendKeys("Balu");
		driver.findElement(By.cssSelector("input[name='rc63input']")).sendKeys("Balu");
		Instant endTime=Instant.now();
		System.out.println(endTime.toString());
		Duration timetaken=Duration.between(startTime, endTime);
		System.out.println("Timetaken:"+timetaken.toMillis()+"milliseconds");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
