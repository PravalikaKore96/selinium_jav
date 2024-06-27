package MouseHover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dubleclick_skilltest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//mousehover on course
WebElement course1=driver.findElement(By.id("course"));
Actions a1=new Actions(driver);
a1.moveToElement(course1).perform();
Thread.sleep(2000);

//click on skilltesting
WebElement skilltesting=driver.findElement(By.xpath("(//a[text()='SkillTesting'])[1]"));
skilltesting.click();

Thread.sleep(2000);
//doubleclick on plus symbol
WebElement plus=driver.findElement(By.id("add"));
a1.doubleClick(plus).perform();

Thread.sleep(2000);
//navigate back
driver.navigate().back();

//mousehover on course
WebElement course2=driver.findElement(By.id("course"));
a1.moveToElement(course2).perform();
Thread.sleep(2000);

//Thread.sleep(2000)
//click on selenium
WebElement selenium=driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
selenium.click();

Thread.sleep(2000);
//doubleclick on plus symbol
WebElement plus1=driver.findElement(By.id("add"));
a1.doubleClick(plus1).perform();

Thread.sleep(2000);
driver.quit();
}
}
