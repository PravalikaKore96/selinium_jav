package POP_UP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Avoid_notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions cm=new ChromeOptions();
		cm.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(cm);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
	}

}
