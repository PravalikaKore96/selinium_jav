package Drop_Down_Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalueIndex_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//click on create Account
	 driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
	 
	 //day
	WebElement day=driver.findElement(By.id("day"));
	 //select class object
	Select s1=new Select(day);
	s1.selectByIndex(6);
	Thread.sleep(3000);
	driver.quit();
	
	}

}
