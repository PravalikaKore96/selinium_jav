package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Stringurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
Thread.sleep(1000);
driver.get("https://www.youtube.com/results?search_query=bookmyshow");

	}

}
