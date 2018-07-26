package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	//config
	System.setProperty("webdriver.chrome.driver","F:\\Sample\\Lib\\chromedriver.exe");
	//launch
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.get("https://www.facebook.com/");
//title
String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.quit();
}
}
