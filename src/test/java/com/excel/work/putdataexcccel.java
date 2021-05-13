package com.excel.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.excel.utility.Xls_reader;

public class putdataexcccel {


	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users/dell/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 100);

		String baseURL = "http://18.140.214.202:9999/login";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
	Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("qanew_qanew");
		
		
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("qanew");

		WebElement enter = driver.findElement(By.xpath("//i[@class='fa fa-sign-in']"));
		enter.submit();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		System.out.println("welcome to the enterprise panel");

		String beforeXpath = "//div[@id='main1']/div/div[2]/div/div[2]/div/div/section/div[3]/div/div/div[";
		String afterxpath = "]/div/div/a[2]/i";

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[@class='fa fa-gear']")));
		List<WebElement> brand = driver.findElements(By.xpath("//i[@class='fa fa-gear']"));
		System.out.println("size of brand:-" + brand.size());
		int sizeofbrand = brand.size();

		for (int i = 1; i <= sizeofbrand; i++) {
			if (i == 5) {
				String Finalxpath = beforeXpath + i + afterxpath;
				driver.findElement(By.xpath(Finalxpath)).click();
				System.out.println("brand open");
			}
		}

		Thread.sleep(2000);
		WebElement catalogue = driver.findElement(By.xpath("//a[text()='catalogue']"));
		catalogue.click();

		Thread.sleep(1000);
		WebElement letsadditems = driver.findElement(By.xpath("//a[text()=' Add New Item']"));
		letsadditems.click();

		System.out.println("Lets add the items ");
		
		Xls_reader reader = new Xls_reader("C:/Users/dell/eclipse-workspace/Mymavenproject/src/test/java/com/test/data/Book1.xlsx");
		int countrow =reader.getRowCount("Sheet1");
		reader.addColumn("Sheet1", "Status");
	for(int f=2;f<=countrow;f++ ) {	
		
		String itemname = reader.getCellData("Sheet1", "Item_Name", f);
		System.out.println(itemname);

		String description = reader.getCellData("Sheet1", "Description", f);
		System.out.println(description);

		String Category = reader.getCellData("Sheet1", "Category", f);
		System.out.println(Category);

		String rate = reader.getCellData("Sheet1", "Rate", f);
		System.out.println(rate);

		String Variant = reader.getCellData("Sheet1", "Variant", f);
		System.out.println(Variant);

		String Tag = reader.getCellData("Sheet1", "Tag", f);
		System.out.println(Tag);

		String multiple_tags = reader.getCellData("Sheet1", "multiple_tags", f);
		System.out.println(multiple_tags);

		String modifier_type = reader.getCellData("Sheet1", "modifier_type (not editable)", f);
		System.out.println(modifier_type);

		String Serves = reader.getCellData("Sheet1", "Serves", f);
		System.out.println(Serves);

		

	

		WebElement enteritem = driver.findElement(By.xpath("//input[@name='itemName']"));
		enteritem.clear();
		enteritem.sendKeys(itemname);

		WebElement itemDescription = driver.findElement(By.xpath("//input[@name='itemDescription']"));
		itemDescription.clear();
		itemDescription.sendKeys(description);

		Select Categoryy = new Select(driver.findElement(By.xpath("//select[@name='itemCategory']")));
		
		Categoryy.selectByVisibleText(Category);
		System.out.println("As category is selected");

		WebElement ratee = driver.findElement(By.xpath("//input[@name='itemRate']"));
		ratee.clear();
		ratee.sendKeys(rate);

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='button multiSelectButton ng-binding']")));
		List<WebElement> varient = driver
				.findElements(By.xpath("//button[@class='button multiSelectButton ng-binding']"));
		System.out.println("Types of varients" + varient.size());
		int varientsize = varient.size();
		for (int i = 0; i <= varientsize; i++) {
			if (i == 1) {
				WebElement clickback = driver
						.findElement(By.xpath("//button[@class='button multiSelectButton ng-binding']"));
				clickback.click();
				System.out.println("please select the varient");
			}
		}

		String beforexxpath = "//div[@id='main1']/div/div[2]/div/div[2]/div/div/section/div[3]/div/div/div/div[3]/div[3]/div[3]/form/div[1]/div[1]/div/div[6]/span/div/form/div[2]/div[";
		String afterxxpath = "]";

		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='checkBoxContainer']/div")));
		List<WebElement> selectvarient = driver.findElements(By.xpath("//div[@class='checkBoxContainer']/div"));
		System.out.println("Types of varients" + selectvarient.size());
		int sizeofvarient = selectvarient.size();

		for (int j = 0; j <= sizeofvarient; j++) {
			String finalxpathh = beforexxpath + 1 + afterxxpath;

			if (j == 1) {
				driver.findElement(By.xpath(finalxpathh)).click();
				System.out.println("medium selected");
				break;
			}

			for (int k = 0; k <= sizeofvarient; k++) {
				if (k == 2) {
					String finalxpathhh = beforexxpath + 2 + afterxxpath;
					driver.findElement(By.xpath(finalxpathhh)).click();
					System.out.println("large selected");
					break;
				}
			}
		}

		Thread.sleep(1000);
		WebElement clickk = driver.findElement(By.xpath("//span[@class='multiSelect inlineBlock ng-isolate-scope']/button[1]/div[1]"));
		clickk.click();

		List<WebElement> enteramt=driver.findElements(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-min']"));
		System.out.println("Enter the size :-"+enteramt.size());
		int sizeofamt=enteramt.size();
			for(int l=0;l<=sizeofamt;l++) {
				if(l==1) {
					driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-min']")).sendKeys("100");
					System.out.println("amt entered");
					
				} if(l==2) {
					driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-min']")).sendKeys("200");
					System.out.println("both amt entered");
					break;
				}
		
			}
			
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='tag']")));
		List<WebElement> tag=driver.findElements(By.xpath("//select[@name='tag']"));
		System.out.println("Number of tags:-"+tag.size());
		int sizeoftag=tag.size();
			for(int t=0;t<=sizeoftag;t++) {
				if(t==1) {
					Select tagg=new Select(driver.findElement(By.xpath("//select[@name='tag']")));
					tagg.selectByVisibleText(Tag);
					System.out.println("tag selected:-"+Tag);
				}}
		
		Thread.sleep(2000);
		Select modifierr=new Select(driver.findElement(By.xpath("//div[@id='main1']/div/div[2]/div/div[2]/div/div/section/div[3]/div/div/div/div[3]/div[3]/div[3]/form/div[1]/div[1]/div/div[10]/select")));
		modifierr.selectByVisibleText(modifier_type);
		System.out.println("modifuer selected"+modifierr);
		
		Thread.sleep(1000);
		WebElement servee=driver.findElement(By.xpath("//input[@name='serves']"));
		servee.clear();
		servee.sendKeys(Serves);
		System.out.println("serves enterd...");
		
		Thread.sleep(2000);
		WebElement additem=driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg']"));
		additem.submit();
		System.out.println("Item created....check that....");
		
		reader.setCellData("Sheet1", "Status", f, "pass");
	}	
				
		
	}
			
			
		
}
			
				
	
		  
		 

	


