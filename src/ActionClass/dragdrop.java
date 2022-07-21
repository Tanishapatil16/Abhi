package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TestFolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/drag_drop.html");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source = dr.findElement(By.linkText("BANK"));
		Thread.sleep(2000);
		
		WebElement Ab = dr.findElement(By.xpath("//li[@id=credit0']"));
		Thread.sleep(2000);
		
		WebElement Ab1 = dr.findElement(By.linkText("SALES"));
		Thread.sleep(2000);
		
		WebElement dest = dr.findElement(By.xpath("//div[@id='shoppingCart1']"));
		Thread.sleep(2000);
		
		
		WebElement dest1 = dr.findElement(By.xpath("//div[@id='shoppingCart3']"));
		Thread.sleep(2000);
		
		WebElement dest3 = dr.findElement(By.xpath("//div[@id='shoppingCart4']"));
		Thread.sleep(2000);
		
		Actions A=new Actions(dr);
		A.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		Thread.sleep(2000);
		
		A.moveToElement(Ab).clickAndHold().moveToElement(dest1).release().build().perform();
		Thread.sleep(2000);
		
		A.moveToElement(Ab1).clickAndHold().moveToElement(dest3).release().build().perform();
		Thread.sleep(2000);
		
		
		
		

	}

}
