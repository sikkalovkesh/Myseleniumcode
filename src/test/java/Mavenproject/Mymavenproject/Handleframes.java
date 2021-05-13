package Mavenproject.Mymavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String basURL="https://www.freecrm.com/";
		driver.get(basURL);
		
		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
//		WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
//		login.click();
//		
//		Thread.sleep(3000);
//		WebElement username=driver.findElement(By.name("email"));
//		username.sendKeys("sikkalovkesh@gmail.com");
//		
//		Thread.sleep(2000);
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys("Lovkesh@123");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//		
//		//navigate to frames
//		driver.switchTo().frame("");
//		
		
		
		
		
	}
	
	
}
