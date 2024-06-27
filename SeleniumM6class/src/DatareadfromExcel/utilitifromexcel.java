package DatareadfromExcel;

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

public class utilitifromexcel {

	public String getData(int row,int cell) throws IOException
	{
	FileInputStream fis=new FileInputStream("./xldata/Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet s1=book.getSheet("sheet2");
	String data=s1.getRow(row).getCell(cell).toString();
	return data;
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		utilitifromexcel u1=new utilitifromexcel();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(u1.getData(0, 0));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(u1.getData(1, 0));
		driver.findElement(By.id("LastName")).sendKeys(u1.getData(2, 0));
		driver.findElement(By.id("Email")).sendKeys(u1.getData(2, 0));
		driver.findElement(By.id("Password")).sendKeys(u1.getData(3, 0));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(u1.getData(4, 0));
		
		}

}
