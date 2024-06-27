package POP_UP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Skilltesting_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(course).perform();
		WebElement skill=driver.findElement(By.xpath("(//a[text()='SkillTesting'])[1]"));
		skill.click();
		WebElement addto=driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
		addto.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		
	}

}
