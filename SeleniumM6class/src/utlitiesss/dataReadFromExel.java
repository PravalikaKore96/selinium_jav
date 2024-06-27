package utlitiesss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataReadFromExel {

	public String getData(int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("./xldata/Book4.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("sheet1");
		String data=s1.getRow(row).getCell(cell).toString();
		return data;
		
}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		dataReadFromExel e1=new dataReadFromExel();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(e1.getData(0, 0));
		driver.findElement(By.name("username")).sendKeys(e1.getData(1, 0));
		driver.findElement(By.name("password")).sendKeys(e1.getData(2, 0));
		
		
		
	}

}
