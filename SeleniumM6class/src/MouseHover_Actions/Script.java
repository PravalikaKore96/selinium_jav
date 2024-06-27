package MouseHover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kseab.karnataka.gov.in/english");
	    WebElement helpline=driver.findElement(By.xpath("//a[@title='Help Line']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(helpline).perform();
		
		//clcik pn kseab
		
		WebElement kseab=driver.findElement(By.xpath("//a[contains(text(),'KSEAB Helpdesk')]"));
		kseab.click();
		
		driver.quit();
		
		}
	}