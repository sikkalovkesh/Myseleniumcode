package Mavenproject.Mymavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelfile {
	
	public static void main(String[] args ) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseURL="https://www.w3schools.com/html/html_tables.asp";
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		//table[@id='customers']/tbody/tr[2]/td[1]
		
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterxpath="]/td[1]";
		
		//table[@id='customers']/tbody/tr[2]/td[2]
		
		String beforexpath_contacts="//table[@id='customers']/tbody/tr[";
		String afterxpath_contacts="]/td[2]";
		
		//table[@id='customers']/tbody/tr[2]/td[3]
		
		String beforexpath_country="//table[@id='customers']/tbody/tr[";
		String afterxpath_country="]/td[3]";
		
		//calculating the total  no rows because in future if the no of rows increase then it does not  disturbs the code
		List<WebElement> listofrows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total no of rows:-"+listofrows.size());
		int rowsize=listofrows.size();
		
		for(int i=2;i<=rowsize;i++){
			String finalxpath= beforeXpath+i+afterxpath;
			String names=driver.findElement(By.xpath(finalxpath)).getText();
			System.out.println("company name:-"+names);
			
			String finalxpath_contacts=beforexpath_contacts+i+afterxpath_contacts;
			String names_contacts=driver.findElement(By.xpath(finalxpath_contacts)).getText();
			System.out.println("contact name:- "+names_contacts);
			
			String finalxpath_country=beforexpath_country+i+afterxpath_country;
			String names_country=driver.findElement(By.xpath(finalxpath_country)).getText();
			System.out.println("country name:-"+names_country);
			
			
		}
		
		
		
		
	}

}
