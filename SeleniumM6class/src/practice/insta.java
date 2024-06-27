package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.instagram.com/");
driver.findElement(By.name("username")).sendKeys("9505255734");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("56165652");
WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
click.submit();
String title=driver.getTitle();
System.out.println(title);

if(title.equalsIgnoreCase("Instagram"))
{
	System.out.println("testcase passed");
}
else
{
	System.out.println("testcase fail");
}
}
}
