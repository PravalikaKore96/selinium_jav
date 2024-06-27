package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		boolean flag=title.contains("Facebook1")&&url.contains("facebook");
		if(flag==true)
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("invalid testcase");
		}
	}

}
