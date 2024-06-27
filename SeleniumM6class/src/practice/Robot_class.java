package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Robot rb=new Robot();
//rb.keyPress(KeyEvent.VK_SHIFT);

//rb.keyPress(KeyEvent.VK_R);
//rb.keyRelease(KeyEvent.VK_R);
//rb.keyRelease(KeyEvent.VK_SHIFT);
//
//
//
//rb.keyPress(KeyEvent.VK_TAB);
//rb.keyRelease(KeyEvent.VK_TAB);
//
//rb.keyPress(KeyEvent.VK_P);
//rb.keyRelease(KeyEvent.VK_P);


rb.keyPress(KeyEvent.VK_PAGE_DOWN);
rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

rb.keyPress(KeyEvent.VK_PAGE_UP);
rb.keyRelease(KeyEvent.VK_PAGE_UP);





		
	}

}
