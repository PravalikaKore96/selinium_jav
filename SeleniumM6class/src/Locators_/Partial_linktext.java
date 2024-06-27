package Locators_;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//launch youtube application
driver.get("https://www.youtube.com/");
Thread.sleep(2000);

//search for puspa 2 songs
driver.findElement(By.name("search_query")).sendKeys("pushpa 2 songs");
Thread.sleep(2000);

//click on search button
driver.findElement(By.id("search-icon-legacy")).click();
Thread.sleep(2000);

//click on vedio
driver.findElement(By.partialLinkText("Sukumar")).click();
driver.close();
	}

}
