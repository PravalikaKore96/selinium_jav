package MouseHover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demowebshop.tricentis.com/computers");

WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),Computers)])[7]"));
Actions a1=new Actions(driver);
a1.moveToElement(computers).perform();

WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),Desktops)])[7]"));
desktop.click();

driver.close();
	}

}
