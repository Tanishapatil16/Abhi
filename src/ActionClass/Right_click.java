package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\TestFolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@class=\'_2IX_2- VJZDxU\']")).sendKeys("Tanisha");
		Thread.sleep(2000);

		dr.findElement(By.xpath("//input[@class=\'_2IX_2- _3mctLh VJZDxU']")).sendKeys("Patil");
		Thread.sleep(2000);
		
		WebElement button = dr.findElement(By.xpath("//button[@class=\'_2KpZ6l _2HKlqd _3AWRsL']"));
		
		Actions A=new Actions(dr);
		Thread.sleep(2000);
		
		A.moveToElement(button).contextClick().build().perform();


	}

}
