package Marketing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Organizations {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
		driver.findElement(By.id("appnavigator")).click();
		
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		
		
		 driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		
		 driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		 driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("development");
		 driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("verifying");
		 driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("application");
		 driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("benefits"); 
		 driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("prajkta18@gmail.com");
		 driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("testing");
		 
		 driver.findElement(By.xpath("(//span[@role='presentation'])[2]")).click();
		 WebElement ele5 = driver.findElement(By.id("s2id_autogen4_search"));
		 ele5.sendKeys("Acquired");
		 
		 Actions a = new Actions(driver);
		 a.sendKeys(ele5, Keys.ENTER);
		 a.perform();
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("development");
		 driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("56");
			 
		
	    JavascriptExecutor j1 = (JavascriptExecutor)driver;
		j1.executeScript("window.scrollBy(0,100)");
		
		
		 driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		 driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.google.com");
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("56");
		 
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
		 Thread.sleep(200);
		 
		 driver.findElement(By.xpath("(//input[@id='Accounts_editView_fieldName_accountname'])[2]")).sendKeys("performance");
		 
		 driver.findElement(By.xpath("(//input[@id='Accounts_editView_fieldName_phone'])[2]")).sendKeys("8975635241");
		 
		 driver.findElement(By.xpath("(//input[@id='Accounts_editView_fieldName_website'])[2]")).sendKeys("www.google.com");
		 
		 
		 driver.findElement(By.xpath("(//b[@role='presentation'])[5]")).click();
		 driver.findElement(By.xpath("(//input[@type='text'])[37]")).sendKeys("Team Selling");
		 Thread.sleep(200);
		 
		 Actions f = new Actions(driver);
		 f.sendKeys(driver.findElement(By.xpath("(//input[@type='text'])[37]")), Keys.ENTER);
		 f.perform();
		 
		 driver.findElement(By.xpath("//button[@name='saveButton']")).click();
		 
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("66");
		
		 driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("abc@gmail.com");
	
		 driver.findElement(By.id("select2-chosen-2")).click();
		 Thread.sleep(2000);
		 WebElement elel = driver.findElement(By.id("s2id_autogen2_search"));
		 elel.sendKeys("Communications");
		 Thread.sleep(50);
		 
		 Actions b = new Actions(driver);
		 b.sendKeys(elel, Keys.ENTER);
		 b.perform();
		 Thread.sleep(50);
		 
		 driver.findElement(By.xpath("//span[@id='select2-chosen-6']")).click();
		 WebElement ele7 = driver.findElement(By.xpath("//input[@id='s2id_autogen6_search']"));
		 ele7.sendKeys("Analyst");
		 Thread.sleep(50);
		
		 Actions c = new Actions(driver);
		 c.sendKeys(ele7, Keys.ENTER);
		 c.perform();
		 Thread.sleep(50);
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		 driver.findElement(By.id("select2-chosen-8")).click();
		 WebElement ele8 = driver.findElement(By.xpath("//input[@id='s2id_autogen8_search']"));
		 ele8.clear();
		 ele8.sendKeys("Marketing Group");
		 Thread.sleep(50);
			
		 Actions d = new Actions(driver);
		 d.sendKeys(ele8, Keys.ENTER);
		 d.perform();	
		 Thread.sleep(50);
	     
	     JavascriptExecutor j2 = (JavascriptExecutor)driver;
		 j2.executeScript("window.scrollBy(0,100)");
		 Thread.sleep(50);
	  	 
		 
		 driver.findElement(By.name("bill_street")).sendKeys("Location: Dubai, ‎United Arab Emirates");
		 driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("25");
		 driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("PUNE");
		 driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("MAHARASHTRA");
		 driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("PQ25698");
		 driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("India");
		 driver.findElement(By.name("ship_street")).sendKeys("pune");
		 driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("456");
		 driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("pune");
		 driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("MAHARASHTRA");
		 
		 
		 JavascriptExecutor j3 = (JavascriptExecutor)driver;
		 j3.executeScript("window.scrollBy(0,100)");
	  	 Thread.sleep(200);
		 
		 driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("PQ4586");
		 driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("India");
		 driver.findElement(By.name("description")).sendKeys("Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do. The benefits of testing include preventing bugs, reducing development costs and improving performance.");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	     driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		 
	     
		 JavascriptExecutor j31 = (JavascriptExecutor)driver;
		 j31.executeScript("window.scrollBy(100,0)");
	  	 
		 
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();


	}

}
