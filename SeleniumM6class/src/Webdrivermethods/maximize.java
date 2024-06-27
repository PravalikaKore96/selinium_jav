package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class maximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(1000);
	driver.close();

}
}
