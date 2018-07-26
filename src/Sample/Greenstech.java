package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {
public static void main(String[] args) {
// Config
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	//Launch
	ChromeDriver driver = new ChromeDriver();
	//url
	driver.get("http://www.greenstech.in/");
	//title
	String title = driver.getTitle();
	System.out.println(title);
	//quit
	driver.quit();
}
}
