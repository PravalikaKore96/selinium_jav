package Webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected_ {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	

	//click on login
	driver.findElement(By.linkText("Log in")).click();

	//enter email
	driver.findElement(By.id("Email")).sendKeys("pravalikakore29@gmail.com");
	

	//enter pwd
	driver.findElement(By.id("Password")).sendKeys("56165652");
	

	//remind me
	WebElement clk=driver.findElement(By.id("RememberMe"));
	clk.click();
	if(clk.isSelected())
	{
	System.out.println("clicked");
	}
	else
	{
		System.out.println("testcase fail1");
	}
	//click on login again after enter email and pwd
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	

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
	

	driver.quit();
}
}
