package utlitiesss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataReadExel {

	public String getData(int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("./xldata/Book1");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("sheet3");
		String data=s1.getRow(row).getCell(cell).toString();
		return data;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		DataReadExel e1=new DataReadExel();
		driver.get(e1.getData(0, 0);
		driver.
		
		
		
	}

}
