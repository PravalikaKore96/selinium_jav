package javascriptexecutor_;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -300)");
		Thread.sleep(1000);
		
	}

}
