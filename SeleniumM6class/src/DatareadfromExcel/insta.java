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

public class insta {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./xldata/Book1.xlsx");
Workbook wb=WorkbookFactory.create(fis);

String url=wb.getSheet("sheet3").getRow(0).getCell(0).toString();
String username=wb.getSheet("sheet3").getRow(1).getCell(0).toString();
String password=wb.getSheet("sheet3").getRow(2).getCell(0).toString();

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(url);
driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);

}

}
