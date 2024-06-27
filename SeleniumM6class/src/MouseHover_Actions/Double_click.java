package MouseHover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapp.skillrary.com/");
	
	WebElement course=driver.findElement(By.id("course"));
	Actions a1=new Actions(driver);
	a1.moveToElement(course).perform();
	
	WebElement selenium1=driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
	selenium1.click();
	
	Thread.sleep(3000);
	WebElement plus1=driver.findElement(By.id("add"));
	a1.doubleClick(plus1).perform();
	
	Thread.sleep(3000);
	driver.close();
	
}

}
