package Mavenproject.Mymavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl="https://www.gmail.com";
		driver.get(baseurl);
		
		//Entering username 
		WebElement username=driver.findElement(By.xpath("//input[@name='identifier']"));
		username.sendKeys("sikkalovkesh4321@gmail.com");
		
		//clicking on next button for entering the password
		WebElement next=driver.findElement(By.xpath("//div[@id='identifierNext']"));
		next.click();
		
		Thread.sleep(4000);
		//Entering the password
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Infeedo@123");
		
		//clicking the login button 
		WebElement login=driver.findElement(By.xpath("//div[@id='passwordNext']"));
		login.click();
		
		System.out.println("===WELCOME TO THE GMAIL ACCOUNT========");
	}

}
