package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook1 {
public static void main(String[] args) {
	System.setProperty("webdriver.driver.chrome", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
