package MouseHover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_contextclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

WebElement search=driver.findElement(By.id("APjFqb"));
Actions a=new Actions(driver);
a.contextClick(search).perform();
Thread.sleep(2000);
driver.close();
		}
}
