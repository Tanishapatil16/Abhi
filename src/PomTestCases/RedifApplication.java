package PomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomobjectRepository.RedifHomePage;
import PomobjectRepository.RedifSignin;


public class RedifApplication
{
	public static void main(String[] args) throws InterruptedException
	//@Test
	//public void login() throws InterruptedException
	{
		
	
	
	System.setProperty("webdriver.chrome.driver","D:\\\\Path\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	RedifHomePage home=new RedifHomePage(driver);
	home.Login().click();
	Thread.sleep(2000);
	
	//WebDriver driver;
	RedifSignin S=new RedifSignin(driver);
	S.UsrName().sendKeys("tanu");
	Thread.sleep(2000);
	S.pass();
	
	
	
	
	
    
    

}
}