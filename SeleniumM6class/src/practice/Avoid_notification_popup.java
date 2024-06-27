package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Avoid_notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions cm=new ChromeOptions();

cm.addArguments("--disable-notifications");

WebDriver driver=new ChromeDriver(cm);

driver.manage().window().maximize();

driver.get("https://www.redbus.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	

}
