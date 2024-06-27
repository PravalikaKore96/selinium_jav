package Webdrivermethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/");

Dimension size=driver.manage().window().getSize();
System.out.println(size);
System.out.println(size.height);
System.out.println(size.width);
driver.close();
	}

}
