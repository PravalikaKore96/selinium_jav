package POP_UP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoskillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course1=driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(course1).perform();
		WebElement sel=driver.findElement(By.xpath("(//a[text()='Selenium'])[2]"));
		a1.click(sel).perform();
		WebElement addcart=driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
		addcart.click();
		//pop-up
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(1000);
		alert.accept();
		
		driver.close();
		
		
		
	}

}
