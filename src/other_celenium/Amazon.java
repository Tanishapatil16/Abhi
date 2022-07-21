package other_celenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\TestFolder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://amazon.in");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
	    dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy m12 mobile");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		Thread.sleep(2000);
		
		WebElement review = dr.findElement(By.xpath("//span[@id='acrCustomerReviewText'][1]"));
		System.out.println(review.getText());
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[@id=\"sw-gtc\"]")).click();
		
	  
	}

}
