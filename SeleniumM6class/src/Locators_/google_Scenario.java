package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
//click gmail
WebElement mail=driver.findElement(By.linkText("Gmail"));
mail.click();
//after clicking mail navigate back page
driver.navigate().back();

//click images
WebElement image=driver.findElement(By.linkText("Images"));
image.click();

//navigate back
driver.navigate().back();

//refresh it
driver.navigate().refresh();
driver.quit();
	}

}
