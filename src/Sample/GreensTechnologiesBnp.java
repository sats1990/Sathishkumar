package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologiesBnp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	WebElement btnBnp = driver.findElement(By.xpath("//a[text() = 'BNP Paribas Interview Question ']"));
	btnBnp.click();
}
}
