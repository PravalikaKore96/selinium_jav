package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dxpath_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate selenium downloads
		driver.get("https://www.selenium.dev/downloads/");
		
		//print C# version (Dynamic xpath)
		WebElement elem=driver.findElement(By.xpath("//p[text()='C#']/../p[2]"));
		System.out.println(elem.getText());
		driver.close();
	}

}
