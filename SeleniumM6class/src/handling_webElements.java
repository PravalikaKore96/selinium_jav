import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_webElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.name("q")).sendKeys("seleni");
List<WebElement> auto=driver.findElements(By.xpath("//span[text()='seleni']"));

System.out.println(auto.size());
for(WebElement ele:auto)
{
	System.out.println(ele.getText());
	
}
driver.close();
	}

}
