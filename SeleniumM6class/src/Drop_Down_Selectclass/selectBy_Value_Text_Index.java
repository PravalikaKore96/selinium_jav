package Drop_Down_Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectBy_Value_Text_Index {

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
	//month
	WebElement month=driver.findElement(By.id("month"));
	//year
	WebElement year=driver.findElement(By.id("year"));
	
	//select class object
	//selectByIndex 
	Select s1=new Select(day);
    s1.selectByIndex(6);
	Thread.sleep(3000);
	
	//SelectByText
	s1=new Select(month);
	s1.selectByVisibleText("May");
	Thread.sleep(3000);
	
	//selectByvalue
	s1=new Select(year);
	s1.selectByValue("1993");
	Thread.sleep(3000);
	
	driver.quit();	
	}
	}
