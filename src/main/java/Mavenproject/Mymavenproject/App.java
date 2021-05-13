package Mavenproject.Mymavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.name("proceed"));
		login.click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		String txt=al.getText();
		if(txt.equals("Please enter a valid user name")) {
			System.out.println("correct");
		}else {
			System.out.println("Not correcrt");
		}
		
		al.accept();
		
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.name("login"));
		username.sendKeys("sikkalovkesh@redifmail.com");
		
		login.click();
		
		System.out.println(al.getText());
		String txtt=al.getText();
		if(txtt.equals("Please enter your password")) {
			al.accept();
			System.out.println("correct 1");
		}else {
			System.out.println("not correct 2");
		}
		
	}
	
	
}


