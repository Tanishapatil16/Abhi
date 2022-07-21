package other_celenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_review 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://amazon.in");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
	  WebElement abhi = dr.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	  abhi.sendKeys("redmi note 10 pro (dark night");
	  abhi.submit();
	  Thread.sleep(2000);
	
	 WebElement shubhi = dr.findElement(By.xpath("//div[@class='a-row a-size-small']"));
	 System.out.println(shubhi.getText());
	 Thread.sleep(2000);
	 
	WebElement source = dr.findElement(By.xpath("//div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']"));
    source.click();

	}

}
