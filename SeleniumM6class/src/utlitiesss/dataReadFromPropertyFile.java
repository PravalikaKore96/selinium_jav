package utlitiesss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataReadFromPropertyFile {

	
	//utility methods (utility means userdefined method)
	public String datafrompropertyfile(String Key) throws IOException
	{
		
		//Step 1
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("./xldata/file.properties");
		pr.load(fis);
		
		String data=pr.getProperty(Key);
		return data;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//step2
dataReadFromPropertyFile t1=new dataReadFromPropertyFile();

driver.get(t1.datafrompropertyfile("url"));
driver.findElement(By.name("username")).sendKeys(t1.datafrompropertyfile("username"));
driver.findElement(By.name("password")).sendKeys(t1.datafrompropertyfile("password"));
	}

}
