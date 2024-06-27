package practice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new  ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

//creating object for web Driver wait class
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

//enter the username
WebElement username=driver.findElement(By.id("email"));
wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("java");

//enter pwd
WebElement pwd=driver.findElement(By.id("pass"));
wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("5665");

//click on login
WebElement clk=driver.findElement(By.name("login"));
wait.until(ExpectedConditions.visibilityOf(clk)).click();

driver.quit();
	}
}
