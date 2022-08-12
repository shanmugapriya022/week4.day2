package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ExceptionHandling {	
public static void main(String[] args)  {		
		// call WDM
		WebDriverManager.chromedriver().setup();
		//launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();	
		//Username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button 
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads button
		driver.findElement(By.linkText("Leads")).click();
		//click find lead
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//Enter First name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shanmugapriya");
		//Click Find leads button
		// //mngc	FDXX₹ 0Ō.//Z,32ḪGHGGHG!wSDdriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-companyName']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
			
	try {
		ele.click();
		}
		catch(StaleElementReferenceException e) {
			System.out.println("stale element exception");
			
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		System.out.println(driver.getTitle());
		}
		
	}}
