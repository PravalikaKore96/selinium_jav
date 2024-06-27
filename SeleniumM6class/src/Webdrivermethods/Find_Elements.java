package Webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

//navigate to amazon appln
driver.get("https://www.amazon.in/");

//search for Iphone
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");

//clcik on search button
driver.findElement(By.id("nav-search-submit-button")).click();

//identify Apple products
List<WebElement> elemnt=driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
//System.out.println(elemnt);

//foreach loop using for printing all apple phones
for(WebElement ele:elemnt)
{
	System.out.println(ele.getText());
}
driver.quit();
	}
}
