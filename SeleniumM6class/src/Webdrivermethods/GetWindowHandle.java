package Webdrivermethods;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
URL url=new URL("https://in.bookmyshow.com/");
driver.navigate().to(url);

String wid=driver.getWindowHandle();
System.out.println(wid);
driver.close();
	}

}
