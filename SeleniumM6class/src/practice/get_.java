package practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
driver.get("https://www.youtube.com/");
String title=driver.getTitle();
System.out.println(title);
String source=driver.getPageSource();
System.out.println(source);
String url=driver.getCurrentUrl();
System.out.println(url);
Thread.sleep(1000);
Dimension size=driver.manage().window().getSize();
System.out.println(size);
System.out.println(size.height+","+size.width);
Thread.sleep(1000);
driver.manage().window().fullscreen();
Point position=driver.manage().window().getPosition();
System.out.println(position);
System.out.println(position.x+","+position.y);
driver.manage().window().minimize();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
System.out.println("hi");
driver.close();
driver.quit();







	}

}
