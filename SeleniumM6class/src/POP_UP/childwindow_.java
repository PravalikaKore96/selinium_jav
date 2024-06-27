package POP_UP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://demowebshop.tricentis.com/computers");
		
		String Parent=driver.getWindowHandle();
		System.out.println(Parent);
		
		Set<String> childAndParent=driver.getWindowHandles();
		System.out.println(childAndParent);
		
		driver.quit();
	}

}
