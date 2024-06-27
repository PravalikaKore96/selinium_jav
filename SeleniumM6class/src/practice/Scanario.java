package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scanario {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
URL url=new URL("https://youtube.com/");
driver.navigate().to(url);
//Thread.sleep(1000);
//driver.close();

driver.navigate().to("https://youtube.com/");
driver.close();

	}

}
