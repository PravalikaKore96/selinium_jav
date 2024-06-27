package datareadfrompropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties pr=new Properties();
FileInputStream fis=new FileInputStream("./xldata/file.properties");
pr.load(fis);

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get(pr.getProperty("url"));
driver.findElement(By.name("username")).sendKeys(pr.getProperty("username"));
driver.findElement(By.name("password")).sendKeys(pr.getProperty("password"));
	}

}
