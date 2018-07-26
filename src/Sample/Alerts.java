package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
}
}
