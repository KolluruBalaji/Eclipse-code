package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Following-sibling
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("kollurubalaji10@gmail.com");
		//Parent
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]/parent::div"));
		//Child
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text']"));
		//Preceding -sibling
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input"));
		//decendant
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[1]")); 
		//following
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]"));
		
		
	}

}
