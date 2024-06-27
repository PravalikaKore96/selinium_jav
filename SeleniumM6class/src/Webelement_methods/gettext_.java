package Webelement_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.amazon.in/?");
//search for puma insearch box
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("puma");
//click on search box
driver.findElement(By.id("nav-search-submit-button")).click();
// select & click on perticular product
driver.findElement(By.partialLinkText("casual")).click();
//get the value from dynamic xpath
WebElement element=driver.findElement(By.xpath("//span[text()='6,299']/../span[2]"));
System.out.println(element.getText());
}
}
