package datareadfrompropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop_ {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
Properties pr=new Properties();
FileInputStream fis=new FileInputStream("./xldata/demowebshop.properties");
pr.load(fis);


WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


driver.get(pr.getProperty("url"));
driver.findElement(By.xpath("//a[text()='Register']")).click();
driver.findElement(By.name("Gender")).click();
driver.findElement(By.id("FirstName")).sendKeys(pr.getProperty("firstname"));
driver.findElement(By.id("LastName")).sendKeys(pr.getProperty("lastname"));
driver.findElement(By.id("Email")).sendKeys(pr.getProperty("email"));
driver.findElement(By.id("Password")).sendKeys(pr.getProperty("password"));
driver.findElement(By.id("ConfirmPassword")).sendKeys(pr.getProperty("confirmpassword"));
Thread.sleep(2000);
driver.close();

		
	}

}
