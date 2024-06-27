package Webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.instagram.com/");
		WebElement username=driver.findElement(By.name("username"));
		if(username.isEnabled())
		{
			username.sendKeys("9505255734");
		}
		else
			System.out.println("not enables");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		if(pwd.isEnabled())
		{
			pwd.sendKeys("56165652");
		}
		else
		{
			System.out.println("pwd not enabled");
		}
		
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		if(click.isDisplayed())
		{
			click.submit();
		}
		else
		{
			System.out.println("not displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equalsIgnoreCase("https://www.instagram.com/"))
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("testcase failed");
		}
		driver.close();
}
}
