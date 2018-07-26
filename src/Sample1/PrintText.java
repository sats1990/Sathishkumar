package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement txtGreens = driver.findElement(By.xpath("//p[Contains text()= 'Our']"));
	String a = txtGreens.getText();
	System.out.println(a);
}
}
