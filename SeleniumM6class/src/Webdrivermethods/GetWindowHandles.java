package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.navigate().to("https://kseab.karnataka.gov.in/english");
driver.findElement(By.linkText("Photo Gallery")).click();
Thread.sleep(1000);

Set wids=driver.getWindowHandles();
System.out.println(wids);
driver.quit();
	}

}
