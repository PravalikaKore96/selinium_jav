package PomClasesss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instapomclassformultiplewebelements {
	
@FindBy(name="username")
private WebElement userName;

@FindBy(name="password")
private WebElement paasword;

@FindBy(xpath="//div[text()='Log in']")
private WebElement login;

public Instapomclassformultiplewebelements(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void userName(String name)
{
	userName.sendKeys(name);
}

public void password(String pwd)
{
	userName.sendKeys(pwd);
}

public void login()
{
	login.click();
}
}


