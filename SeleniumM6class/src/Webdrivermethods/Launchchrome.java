package Webdrivermethods;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the browser name");
String name=sc.next();
if(name.equalsIgnoreCase("chrome"))
{
	new ChromeDriver();
}
else if(name.equalsIgnoreCase("firefox"))
{
	new FirefoxDriver();
}
else if(name.equalsIgnoreCase("Edge"))
{
	new EdgeDriver();
}
else
{
	System.out.println("enter valid browser");
}
	}

}
