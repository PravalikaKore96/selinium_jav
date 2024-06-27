package Screenshot_;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getscreensho_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://snapdeal.com/");
		
		//downcast
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//create temp location
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//create permnent location
		File perm=new File("./screenshottt/snapdeal.png");
		
		//cpy from temp to perm
		FileHandler.copy(temp, perm);
		
		driver.close();
	}

}
		