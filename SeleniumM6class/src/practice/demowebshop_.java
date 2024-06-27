package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);

//click on login
driver.findElement(By.linkText("Log in")).click();

//enter email
driver.findElement(By.id("Email")).sendKeys("pravalikakore29@gmail.com");
Thread.sleep(2000);

//enter pwd
driver.findElement(By.id("Password")).sendKeys("56165652");
Thread.sleep(2000);

//remind me
driver.findElement(By.id("RememberMe")).click();
Thread.sleep(2000);

//click on login again after enter email and pwd
driver.findElement(By.xpath("//input[@value='Log in']")).click();
Thread.sleep(2000);

String Actualurl=driver.getCurrentUrl();


if(Actualurl.equals("https://demowebshop.tricentis.com/"))
{
	System.out.println("testcase pass");
}
else
{
	System.out.println("test case fail");
}

//click on logout
driver.findElement(By.xpath("//a[text()='Log out']")).click();
Thread.sleep(2000);

driver.quit();
	}

}
