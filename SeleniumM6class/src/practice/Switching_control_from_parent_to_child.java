package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_control_from_parent_to_child {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.xpath("(//a[text()=' SQL Editor'])[2]")).click();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		System.out.println("completed");
		
		
	}
}
