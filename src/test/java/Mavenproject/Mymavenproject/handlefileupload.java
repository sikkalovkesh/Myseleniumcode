package Mavenproject.Mymavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlefileupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String basURL="https://html.com/input-type-file/";
		driver.get(basURL);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement uploadfile=driver.findElement(By.xpath("//input[@name='fileupload']"));
		uploadfile.sendKeys("C:\\Users\\dell\\Downloads\\asaf.pdf");
		System.out.println("check file is  uploaded or not...");

	}

}
