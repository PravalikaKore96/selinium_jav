package Screenshot_;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class skillrary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://skillrary.com/");
		
		//downcast
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//use method to take screenshot
	File temp=ts.getScreenshotAs(OutputType.FILE);
	
	//create permenent location
	File perm=new File("./skillrary/homepage.png");
	
	//cpy from temp to perm
	
	FileHandler.copy(temp, perm);
	driver.close();
		
		
	}

}
