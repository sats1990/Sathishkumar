package Sample1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailAct {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "F:\\Sample\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	WebElement txtEmail = driver.findElement(By.xpath("//input[@type = 'email']"));
	txtEmail.sendKeys("satsp1990");
	WebElement btnNext = driver.findElement(By.className("CwaK9"));
	btnNext.click();
	WebElement txtPassword = driver.findElement(By.xpath("//input[@jsname = 'YPqjbf']"));
	txtPassword.sendKeys("Telstra@2015");
	WebElement btnNext1 = driver.findElement(By.className("CwaK9"));
	btnNext1.click();
}	
}

