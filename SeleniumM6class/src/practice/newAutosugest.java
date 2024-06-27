package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newAutosugest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.google.com/");
WebElement search=driver.findElement(By.id("APjFqb"));
search.sendKeys("seleni");
List<WebElement> all=driver.findElements(By.xpath("//span[text()='seleni']"));
System.out.println(all.size());
for(WebElement e1:all)
{
	
	System.out.println(e1.getText());
}

	}

}
