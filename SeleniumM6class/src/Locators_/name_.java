package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//username locator
Thread.sleep(2000);
WebElement username=driver.findElement(By.id("email"));
username.sendKeys("admin");

//password
Thread.sleep(2000);
WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("abc@123");

//login click
Thread.sleep(2000);
WebElement CLICK=driver.findElement(By.name("login"));
CLICK.click();
Thread.sleep(10000);
driver.quit();
}
}
