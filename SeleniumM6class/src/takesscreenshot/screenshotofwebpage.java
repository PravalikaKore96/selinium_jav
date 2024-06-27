package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utlitiesss.webelementScreenshot;

public class screenshotofwebpage {

	public void screenshotpage(String url) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	WebElement sql=driver.findElement(By.xpath("(//a[text()='SQL'])[2]"));
		         
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./xldata/skillrary.png");
	  FileHandler.copy(temp, perm);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	    screenshotofwebpage s1=new screenshotofwebpage();
		s1.screenshotpage("https://demoapp.skillrary.com/");
		
	}

}
