package Webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");;

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//search youtube
WebElement search=driver.findElement(By.id("APjFqb"));

search.sendKeys("youtube");

search.sendKeys("selenium.div");
driver.close();
	}
}



