package utlitiesss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelementScreenshot {

	public void screenshot(String element) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSE']"));
		
		File temp=course.getScreenshotAs(OutputType.FILE);
		File perm=new File("./xldata/course3s.png");
		FileHandler.copy(temp, perm);
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		webelementScreenshot s1=new webelementScreenshot();
		s1.screenshot("course");
		
	}

}
