package Webelement_methods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//print size(height and width of webpage
Dimension size1=driver.manage().window().getSize();
System.out.println(size1);

//print size(height and width of wenbelement
WebElement UN=driver.findElement(By.id("email"));
Dimension size=UN.getSize();
System.out.println(size.getHeight());
System.out.println(size.getWidth());

//print position(location) of webelemnt
WebElement username=driver.findElement(By.id("email"));
Point location=username.getLocation();
System.out.println(location.getX()+location.getY());

//print position of webpage
Point locat=driver.manage().window().getPosition();
System.out.println(locat);

driver.quit();
	}

}
