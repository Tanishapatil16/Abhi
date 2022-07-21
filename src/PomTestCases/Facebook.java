package PomTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomobjectRepository.FacebookHome;

//import PomobjectRepository.FacebookHome;
import org.openqa.selenium.By;
//import PomobjectRepository.FacebookHome;

public class Facebook 
{
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Path\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		FacebookHome home=new FacebookHome(dr);
		home.Name();
		home.PAss();
		
		
		
		
	}


}
