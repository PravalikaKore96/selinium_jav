package Webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_url {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
URL url=new URL("https://www.amazon.in/");
driver.navigate().to(url);
System.out.println(url);
Thread.sleep(1000);
driver.close();
	}

}
