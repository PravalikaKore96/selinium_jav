package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class sam1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/");
		
		Actions a1=new Actions(driver);
		
		WebElement course=driver.findElement(By.id("course"));
		
		
a1.moveToElement(course).perform();
WebElement selnium=driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));

selnium.click();

WebElement zoom1=driver.findElement(By.className("zoom"));

File temp=zoom1.getScreenshotAs(OutputType.FILE);

File perm=new File("./Screenshottt/sel.png");

FileHandler.copy(temp, perm);

driver.close();

	}

}
