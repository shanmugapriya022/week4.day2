package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	public static void main(String[] args) {
		
		//Setup WDM
		WebDriverManager.chromedriver().setup();
				//Create browser object and Launch URL 
				ChromeDriver driver=new ChromeDriver();								
				driver.get("https://www.redbus.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement signIn = driver.findElement(By.xpath("//a[link()='About Us']"));
				Actions builder = new Actions(driver);
				builder.scrollToElement(signIn).perform();
				
				
				
				
	}		
				
				
				
}
