package POP_UP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Avoid_Notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Avoiding notification popup
		ChromeOptions cm=new ChromeOptions();
		cm.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(cm);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
		
		
	}

}
