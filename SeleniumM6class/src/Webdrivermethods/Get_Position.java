package Webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://www.overleaf.com/");
Point cor=driver.manage().window().getPosition();
System.out.println(cor);
System.out.println(cor.x);
System.out.println(cor.y);
driver.close();

	}

}
