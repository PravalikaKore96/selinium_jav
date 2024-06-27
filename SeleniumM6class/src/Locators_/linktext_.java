package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

// click forgottenpassword
WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
forgotpassword.click();

//Enter number
WebElement number=driver.findElement(By.id("identify_email"));
number.sendKeys("578990");

//click search

WebElement CLICK=driver.findElement(By.name("did_submit"));
CLICK.click();

driver.quit();
	}

}
