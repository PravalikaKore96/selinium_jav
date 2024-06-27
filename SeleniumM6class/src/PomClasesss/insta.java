package PomClasesss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.instagram.com/");

driver.navigate().refresh();
Instapomclassformultiplewebelements i1=new Instapomclassformultiplewebelements(driver);
i1.userName("admin");
i1.password("admin123");
i1.login();


	}

}
