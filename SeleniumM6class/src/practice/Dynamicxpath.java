package practice;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
WebElement click=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
click.submit();
WebElement price=driver.findElement(By.xpath("//span[contains(text(),'iPhone 14 (128 GB)')]/../span[1]"));
//price.click();
System.out.println(price.getText());


	}

}
