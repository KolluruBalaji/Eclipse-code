package log4j;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;



public class TestLog {
public void Test2() {
		
		Logger log=LogManager.getLogger("TestLog");
		System.out.println("this is logger demo");
		log.info("for info only ");
		log.debug("for debug");
		log.error("for message");
		log.warn("warning message");
		}
	
	
public static  void main(String [] args) {

}
}
