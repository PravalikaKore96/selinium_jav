package javascriptexecutor_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 1000)");
		//Thread.sleep(1000);
		//js.executeScript("window.scrollTo(0, 500)");
		//Thread.sleep(1000);
		
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		
		
	}

}
