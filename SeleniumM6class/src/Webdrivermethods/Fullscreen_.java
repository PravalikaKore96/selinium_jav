package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/");
Thread.sleep(1000);
driver.manage().window().fullscreen();
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
driver.manage().window().minimize();
Thread.sleep(1000);
driver.quit();
}
}
