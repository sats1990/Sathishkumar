package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreensTechnologies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btnContact = driver.findElement(By.xpath("//a[@href = 'contact.php']"));
		btnContact.click();
	}
}