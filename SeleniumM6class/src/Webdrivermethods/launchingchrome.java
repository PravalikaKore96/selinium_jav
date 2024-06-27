package Webdrivermethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingchrome {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		WebDriver driver;
		System.out.println("enter browser name");
		//System.out.println("1.chrome\n2.firefox\n3.edge");
		String name=sc.next();
	switch(name)
		{
		case"Chrome":
			driver=new ChromeDriver();
			break;
		case"Firefox":
			driver=new FirefoxDriver();
			break;
		case"Edge":
			driver=new EdgeDriver();
			break;
			default:
			System.out.println("entter valid browesr name");
				
			}
			}
	}

