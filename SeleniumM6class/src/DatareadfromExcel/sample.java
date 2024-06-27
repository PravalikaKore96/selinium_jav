package DatareadfromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//create object for FileInputStream class
		FileInputStream fis=new FileInputStream("./xldata/Book1.xlsx");
		//create object for workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//reading data from the Excel sheet
		String url=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		String username=wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		String password=wb.getSheet("sheet1").getRow(2).getCell(0).toString();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//passing data from the excel sheet
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
	}

}
