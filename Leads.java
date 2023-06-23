package Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Leads {

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
		
		 driver.findElement(By.xpath("//span[text() = ' Leads'] ")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		 Thread.sleep(200);
		 
		 
		 
		 driver.findElement(By.xpath("(//b[@role='presentation'])[1]")).click();
		 WebElement ele5 = driver.findElement(By.xpath("(//input[@id='s2id_autogen2_search'])"));
		 ele5.sendKeys("Dr.");
		 
		 Actions a = new Actions(driver);
		 a.sendKeys(ele5, Keys.ENTER);
		 a.perform();
		 
	    
		 
		 driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Software");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("performance");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("8525963789");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("improving");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("8521239634");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("development");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("include");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("abc@gmail.com");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("wwww.abc.com");
		 Thread.sleep(200);
		 
		 driver.findElement(By.xpath("(//span[@id='select2-chosen-8'])")).click();
		 WebElement ele4 = driver.findElement(By.xpath("(//input[@id='s2id_autogen8_search'])"));
		 ele4.sendKeys("Contacted");
		 
		 Actions x = new Actions(driver);
		 x.sendKeys(ele4, Keys.ENTER);
		 x.perform();
		 
		 
		 driver.findElement(By.xpath("(//span[@id='select2-chosen-10'])")).click();
		 WebElement ele6 = driver.findElement(By.xpath("(//input[@id='s2id_autogen10_search'])"));
		 ele6.sendKeys("Project Cancelled");
		 
		 Actions b = new Actions(driver);
		 b.sendKeys(ele6, Keys.ENTER);
		 b.perform();
		 
		 
		 
		 driver.findElement(By.xpath("(//span[@id='select2-chosen-12'])")).click();
		 WebElement ele7 = driver.findElement(By.xpath("(//input[@id='s2id_autogen12_search'])"));
		 ele7.sendKeys("Team Selling");
		 
		 Actions c = new Actions(driver);
		 c.sendKeys(ele7, Keys.ENTER);
		 c.perform();
		 
		 
		 driver.findElement(By.xpath("(//span[@id='select2-chosen-4'])")).click();
		 WebElement ele8 = driver.findElement(By.xpath("(//input[@id='s2id_autogen4_search'])"));
		 ele8.sendKeys("Cold Call");
		 
		 Actions d = new Actions(driver);
		 d.sendKeys(ele8, Keys.ENTER);
		 d.perform();
		 
		 
		 
		 driver.findElement(By.xpath("(//span[@id='select2-chosen-6'])")).click();
		 WebElement ele9 = driver.findElement(By.xpath("(//input[@id='s2id_autogen6_search'])"));
		 ele9.sendKeys("Biotechnology");
		 
		 Actions e = new Actions(driver);
		 e.sendKeys(ele9, Keys.ENTER);
		 e.perform();
		 
		 
		 driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("99");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("65");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("abc@gmail.com");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("preventing");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("456");
		 Thread.sleep(200);
		 
		 JavascriptExecutor j1 = (JavascriptExecutor)driver;
			j1.executeScript("window.scrollBy(0,100)");
		 
		 driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("testing");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("software product");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("india");
		 
		 driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("application");
		 Thread.sleep(200);
		 
		 driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do. The benefits of testing include preventing bugs, reducing development costs and improving performance.");
		 
		 driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("verifying");
		 Thread.sleep(200);
		 
		 driver.findElement(By.xpath("//button[text ()='Save']")).click();
		 Thread.sleep(200);
		 
         driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		 
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

		 
		
		 
	}

}
