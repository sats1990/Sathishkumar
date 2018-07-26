package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://tamilrockers-s.co/index/tamil-2018-movies-tamil-full-movie-download?get-page=2");
	driver.quit();
}
}
