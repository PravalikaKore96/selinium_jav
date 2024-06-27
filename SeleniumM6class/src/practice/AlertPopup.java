package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSE']"));
	    Actions a1=new Actions(driver);
		a1.moveToElement(course).perform();
		
		WebElement selenium=driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
		selenium.click();
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
	Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
