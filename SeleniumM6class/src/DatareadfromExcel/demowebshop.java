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


public class demowebshop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./xldata/book1.xlsx");
Workbook wb=WorkbookFactory.create(fis);


String url=wb.getSheet("sheet2").getRow(0).getCell(0).toString();
String Firstname=wb.getSheet("sheet2").getRow(1).getCell(0).toString();
String lastname=wb.getSheet("sheet2").getRow(2).getCell(0).toString();
String email=wb.getSheet("sheet2").getRow(3).getCell(0).toString();
String password=wb.getSheet("sheet2").getRow(4).getCell(0).toString();
String cpwd=wb.getSheet("sheet2").getRow(5).getCell(0).toString();

System.out.println(url);
System.out.println(Firstname);
System.out.println(lastname);
System.out.println(email);
System.out.println(password);
System.out.println(cpwd);


WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


driver.get(url);
driver.findElement(By.id("FirstName")).sendKeys(Firstname);
driver.findElement(By.id("LastName")).sendKeys(lastname);
driver.findElement(By.id("Email")).sendKeys(email);
driver.findElement(By.id("Password")).sendKeys(password);
driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
driver.findElement(By.id("register-button")).click();

driver.close();
	}
}
