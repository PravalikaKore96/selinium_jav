package Drop_Down_Selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement car=driver.findElement(By.id("cars"));
		
		//select class object
		Select s1=new Select(car);
		
		//selcting
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("90");
		Thread.sleep(2000);
		s1.selectByValue("199");
		
		//deselect 
		s1.deselectByIndex(0);
		Thread.sleep(2000);
		s1.deselectByValue("199");
		
		List<WebElement> l1=s1.getOptions();
		System.out.println(l1.size());
		for(WebElement ele:l1)
		{
			System.out.println(ele.getText());
		}
      }
	}
