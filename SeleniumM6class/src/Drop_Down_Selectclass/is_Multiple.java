package Drop_Down_Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class is_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement All=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(All);
		s1.selectByIndex(3);
		
		if(s1.isMultiple())
		{
			System.out.println("It is multiselect");
		}
		else
		{
			System.out.println("it is single select");
		}
		driver.close();
		}
	}
