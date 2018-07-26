package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Satsksr31@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Telstra@2015");
		WebElement btnClick = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		btnClick.click();
	}
}
