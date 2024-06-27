package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapp.skillrary.com/index.php");

WebElement course=driver.findElement(By.xpath("//a[text()='COURSE']"));
Actions a1=new Actions(driver);
a1.moveToElement(course).perform();
WebElement selenium=driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
a1.click(selenium).perform();

WebElement plus=driver.findElement(By.id("add"));
a1.doubleClick(plus).perform();



	}

}
