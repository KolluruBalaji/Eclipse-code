package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Using Text
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//Using Contains
		driver.findElement(By.xpath("//a[contains(text(),'Sign in into ')]")).click();
		//Starts with
		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in in')]")).click();
		//Normalized space
		driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")).click();

}
}
