package practice;

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

public class ts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//TakesScreenshot ts=(TakesScreenshot)driver;

WebElement sq=driver.findElement(By.xpath("(//a[text()='SQL'])[2]"));
File temp=sq.getScreenshotAs(OutputType.FILE);
File perm=new File("./ss/demo2.png");
FileHandler.copy(temp, perm);





	}

}
