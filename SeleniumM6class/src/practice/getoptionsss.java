package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		
		WebElement all=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(all);
		List<WebElement> l1=s1.getOptions();
		TreeSet t1=new TreeSet();
		
		for(WebElement e1:l1)
		{
			t1.add(e1.getText());
		}
		
		Iterator itr=t1.descendingIterator();  
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
