package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
ele.click();
WebElement month=driver.findElement(By.id("month"));
Select s1=new Select(month);
s1.selectByVisibleText("Aug");

List<WebElement> l1=s1.getOptions();
TreeSet<String> t1=new TreeSet();

for(WebElement i:l1)
{
	t1.add(i.getText());//System.out.println(i.gettext());
}
//Asending order

Iterator itr=t1.iterator();


while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("-----------");

Iterator itr1=t1.descendingIterator();

while(itr1.hasNext())
{
	System.out.println(itr1.next());
}
driver.close();
	}
	}
