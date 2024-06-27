package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/");
driver.manage().window().maximize();
// click ui testing
driver.findElement(By.linkText("UI Testing Concepts")).click();
//name
WebElement name=driver.findElement(By.name("name"));
name.sendKeys("admin");
//email

WebElement mail=driver.findElement(By.name("email"));
mail.sendKeys("abd@mail.com");
//password
WebElement pwd=driver.findElement(By.name("password"));
pwd.sendKeys("33r343");
//click register
driver.findElement(By.linkText("Register")).click();
Thread.sleep(2000);
driver.quit();

}

}
