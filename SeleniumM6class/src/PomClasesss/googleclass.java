package PomClasesss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.google.com/");

//WebElement search=driver.findElement(By.id("APjFqb"));

driver.navigate().refresh();

googlePomclass g1=new googlePomclass(driver);

g1.demo("insta");

}

}
