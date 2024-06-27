package POP_UP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switching_childwindow_using_getwindowhandle {

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://skillrary.com/");
		
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SQL Editor'])[2]")).click();
		
		String parent=driver.getWindowHandle();
		
		
		Thread.sleep(2000);
		//switching the control from child to parent
		driver.switchTo().window(parent);
		
		WebElement gear=driver.findElement(By.xpath("//a[text()=' GEARS ']"));
		gear.click();
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
//		
//		rb.keyPress(KeyEvent.VK_P);
//		rb.keyRelease(KeyEvent.VK_P);
//		
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyRelease(KeyEvent.VK_TAB);
//		
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//driver.quit();
		
		
	}

}
