package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Left_click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Path\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Otp = dr.findElement(By.xpath("//button[contains(text(),'Request OTP')]"));
		Thread.sleep(2000);

		Actions A=new Actions(dr);
		A.moveToElement(Otp).click().build().perform();
		
	}

}
