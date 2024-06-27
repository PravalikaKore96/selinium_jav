package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class demappskillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapp.skillrary.com/index.php");

String id=driver.getWindowHandle();
System.out.println(id);

driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.facebook.com/");
Set childandparent=driver.getWindowHandles();
System.out.println(childandparent);
Thread.sleep(2000);
driver.close();
	}

}
