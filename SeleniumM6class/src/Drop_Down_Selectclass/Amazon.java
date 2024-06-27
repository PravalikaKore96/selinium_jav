package Drop_Down_Selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement All=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(All);
	List<WebElement> l1=s1.getOptions();
	
	System.out.println(l1.size());
	
		for(WebElement ele:l1)
		{
			System.out.println(ele.getText());
		}
		}
}
