package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[text()='Create new account']")).click();
WebElement day=driver.findElement(By.id("day"));
Select s1=new Select(day);
s1.selectByIndex(6);

WebElement month=driver.findElement(By.id("month"));
s1=new Select(month);
s1.selectByVisibleText("Feb");
WebElement year=driver.findElement(By.id("year"));
s1=new Select(year);
s1.selectByValue("2020");

List<WebElement> l1=s1.getOptions();
System.out.println(l1.size());

for(WebElement e1:l1)
{
	System.out.println(e1.getText());
}

	}

}
