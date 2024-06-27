package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		FileInputStream fis= new FileInputStream("./Instagram.properties");
		pr.load(fis);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(pr.getProperty("url"));
		WebElement elem=driver.findElement(By.name("username"));
		elem.sendKeys(pr.getProperty("username"));
		
		
		
		
	}

}
