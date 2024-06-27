package POP_UP;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
