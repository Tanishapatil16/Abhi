package PomTestNg;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GrowwTest 
{
   WebDriver driver;
   Sheet sheet;
   Logingroww1 login;
   logingrow2 login2;
   growHomePage homelogin;
	
	@BeforeClass
	
	public void StartBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Aa\\\\Desktop\\\\Screenshot\\\\Book1.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("grow");
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Path\\\\chromedriver_win32\\\\chromedriver.exe");
	    
		ChromeOptions options=new ChromeOptions();
		options.addArguments("==disable notification");
						
		driver=new ChromeDriver(options);
		
		homelogin=new growHomePage(driver);
		login=new Logingroww1(driver);
	    login2=new logingrow2(driver);
	    
		driver.get("https://www.groww.in");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	
	
	
	@Test
	public  void loginpage()
	{
		String UN=sheet.getRow(0).getCell(0).getStringCellValue();
		String ppass=sheet.getRow(0).getCell(1).getStringCellValue();
		//driver.findElement(By.xpath("//span[@class='absolute-center']")).click();
		homelogin.clicckkk();
		
		login.Entermail(UN);
		login.click();
		
		login2.EnterPass(ppass);
		login2.Button();
	}
	
	@AfterMethod
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
		
	}
}
