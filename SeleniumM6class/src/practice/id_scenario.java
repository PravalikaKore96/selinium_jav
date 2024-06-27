package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_scenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");

WebElement username=driver.findElement(By.id("name"));
username.sendKeys("admin");

WebElement mail=driver.findElement(By.id("email"));
mail.sendKeys("abd@mail");
Thread.sleep(1000);

WebElement password=driver.findElement(By.id("password"));
password.sendKeys("2345");
Thread.sleep(1000);
driver.close();


	}

}
