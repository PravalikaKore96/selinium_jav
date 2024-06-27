package PomClasesss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePomclass {
//pomclass
	
//declaration
		@FindBy(id="APjFqb")
		private WebElement search;
		
		
//Initialization
		googlePomclass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
//Utilization
		public void demo(String sms)
		{
			search.sendKeys(sms);
		}
	

}
