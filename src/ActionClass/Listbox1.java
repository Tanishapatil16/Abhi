package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TestFolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement list = dr.findElement(By.xpath("//select[@id=\'day']"));
		Thread.sleep(2000);
		
		Actions A=new Actions(dr);
		A.moveToElement(list).click().build().perform();
		Thread.sleep(2000);
		
		A.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		A.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		A.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		A.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		
		
		A.sendKeys(Keys.ENTER).perform();
	
		
		
		
		
		
		
		

	}

}
