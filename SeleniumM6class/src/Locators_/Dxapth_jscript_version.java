package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dxapth_jscript_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate selenium downloads
		driver.get("https://www.selenium.dev/downloads/");
		
		//print javascript version (Dynamic xpath)
		WebElement elem=driver.findElement(By.xpath("//p[text()='JavaScript']/../p[2]"));
		System.out.println(elem.getText());
		driver.close();
	}

}
