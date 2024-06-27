package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");

driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://demowebshop.tricentis.com/computers");

String parent=driver.getWindowHandle();
System.out.println(parent);
driver.close();

Set<String> childAndParent=driver.getWindowHandles();
System.out.println(childAndParent);


	}

}
