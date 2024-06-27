package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

WebElement username=driver.findElement(By.id("email"));
username.sendKeys("Admin");
Thread.sleep(1000);

WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("password");
Thread.sleep(2000);
driver.close();
	}
	}
