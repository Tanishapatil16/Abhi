package Pom;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://groww.in");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//span[@class='absolute-center']")).click();
		
		class1 loginpage=new class1(dr);
		loginpage.Entermail();
		Thread.sleep(2000);
		
		loginpage.click();
		Thread.sleep(2000);
		
		//class2
		
		class2 submit=new class2(dr);
		submit.EnterPass();
		Thread.sleep(2000);
		submit.Button();
		
		

	}

}
