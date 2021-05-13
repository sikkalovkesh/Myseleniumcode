package Mavenproject.Mymavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatescreenshots {
	
	public static void main(String[]args) throws InterruptedException, IOException, WebDriverException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String googleurl="https://www.google.com";
		String amazonurl="https://www.amazon.com";
		
		driver.get(googleurl);
		
		Thread.sleep(2000);
		
		driver.navigate().to(amazonurl);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//take the screenshots
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//store the screenshots
		FileUtils.copyFile(src, new File("C:/Users/dell/eclipse-workspace/Mymavenproject/src/test/java/Mavenproject/Mymavenproject/b.jpeg"));
		
		
		
		
		
	}
	

}
