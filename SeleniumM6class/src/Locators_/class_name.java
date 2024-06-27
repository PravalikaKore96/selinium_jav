package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
//lauch demo webshop application
driver.get("https://demowebshop.tricentis.com/");

//click on register
driver.findElement(By.className("ico-register")).click();
//navigate back
driver.navigate().back();
//click on login
driver.findElement(By.className("ico-login")).click();
//navigate back
driver.navigate().back();
driver.close();

	}

}
