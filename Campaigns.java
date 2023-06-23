package Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Campaigns {

	public static void main(String[] args) throws InterruptedException {
		

		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
		Thread.sleep(200);
		
		 driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("software");
		 Thread.sleep(200);
		 
		 
		 driver.findElement(By.id("select2-chosen-4")).click();
		 WebElement ele7 = driver.findElement(By.id("s2id_autogen4_search"));
		 ele7.sendKeys("Active");
		 
		 Actions a = new Actions(driver);
		 a.sendKeys(ele7, Keys.ENTER);
		 a.perform();
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("25");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("quality");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("25");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("tax2_check")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("536");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Products_editView_fieldName_discontinued")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("tax1_check")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("tax3_check")).click();
		 Thread.sleep(200);
		  
		 
		 driver.findElement(By.xpath("(//b[@role='presentation'])[5]")).click();
		 driver.findElement(By.xpath("(//input[@type='text'])[33]")).sendKeys("Support Group");
		 Thread.sleep(200);
		 
		 Actions z = new Actions(driver);
		 z.sendKeys(driver.findElement(By.xpath("(//input[@type='text'])[33]")), Keys.ENTER);
		 z.perform();
		 

		 
		 
		 driver.findElement(By.name("saveButton")).click();
		 
		 
		 WebElement day = driver.findElement(By.id("Campaigns_editView_fieldName_closingdate"));
		 day.click();
		 
		 driver.findElement(By.xpath("(//td[@class='day'])[25]")).click();
		 
		 driver.findElement(By.id("product_id_display")).sendKeys("25");
		 Thread.sleep(200);
		 
		 
		 driver.findElement(By.id("select2-chosen-2")).click();
		 WebElement ele5 = driver.findElement(By.id("s2id_autogen2_search"));
		 ele5.sendKeys("Support Group");
		 
		 Actions l = new Actions(driver);
		 l.sendKeys(ele5, Keys.ENTER);
		 l.perform();
		 
		 
		 driver.findElement(By.id("select2-chosen-6")).click();
		 WebElement ele6 = driver.findElement(By.id("s2id_autogen6_search"));
		 ele6.sendKeys("Advertisement");
		 
		 Actions b = new Actions(driver);
		 b.sendKeys(ele6, Keys.ENTER);
		 b.perform();
		 
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("product");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("defects");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("80");
		 Thread.sleep(200);
		 
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("50");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("s2id_autogen7")).click();
		 WebElement ele9 = driver.findElement(By.id("s2id_autogen8_search"));
		 ele9.sendKeys("Excellent");
		 
		 Actions e= new Actions(driver);
		 e.sendKeys(ele9, Keys.ENTER);
		 e.perform();
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("200");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("300");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("400");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("100");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("500");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("600");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("700");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("800");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do. The benefits of testing include preventing bugs, reducing development costs and improving performance.");
		 Thread.sleep(200);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(200);
		 
		 
		 driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		 
		 
		 
		 
		 
	}

}
