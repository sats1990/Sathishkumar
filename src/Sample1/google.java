package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
public static void main(String[] args) {
	System.setProperty("wedriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	
}
}
