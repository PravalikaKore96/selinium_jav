package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlywait1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/computers");

//creating object for Webdriverwait class
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

WebElement login1=driver.findElement(By.linkText("Log in"));
wait.until(ExpectedConditions.visibilityOf(login1)).click();

driver.quit();
	}

}
