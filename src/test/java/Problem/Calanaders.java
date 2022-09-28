package Problem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Calanaders {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		driver.findElement(By.name("checkin")).click();
		String month = "September 2022";
		int day = 3;
		while (true) {

			String checkMonth = driver
					.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (checkMonth.equals(month)) {
				break;
			} else
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		}

			driver.findElement(
					By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr/td[@class=\"day \" and contains(text(),"+day+")]"))
					.click();
		//driver.quit();

	}

}
