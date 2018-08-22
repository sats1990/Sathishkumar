package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
public static void main(String[] args) {
	//config
	System.setProperty("webDriver.Chrome.driver","F:\\Sample\\Lib\\chromedriver.exe");
	
	// launch
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
      
}
}
