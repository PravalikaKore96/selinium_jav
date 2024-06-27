import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_autosuj_youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.youtube.com/");

//search for puspa
WebElement search=driver.findElement(By.id("search"));
search.sendKeys("push");

List<WebElement> autosuj=driver.findElements(By.xpath("//span[text()='push']"));
System.out.println(autosuj.size());
for(WebElement ele:autosuj)
{
	System.out.println(ele.getText());
}
	}

}
