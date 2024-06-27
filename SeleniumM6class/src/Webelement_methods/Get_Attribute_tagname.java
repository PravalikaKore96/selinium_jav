package Webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demowebshop.tricentis.com/register");
WebElement firstname=driver.findElement(By.id("FirstName"));
//get_Attribute
String value=firstname.getAttribute("class");
System.out.println(value);

//get tagname

String tagname=firstname.getTagName();
System.out.println(tagname);

driver.close();
}
}
