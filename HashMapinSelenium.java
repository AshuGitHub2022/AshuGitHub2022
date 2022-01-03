package ashushivamproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ashushivamproject.TestNGListeners.class)

public class HashMapinSelenium {
     
	@Test
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Sign Up")).click();
		
	    Set<String> windowIds = driver.getWindowHandles();
	    
	    Iterator <String> it = windowIds.iterator();
	    
	    String parentWindowId= it.next();
	    String ChildWindowId = it.next();
	    
	    driver.switchTo().window(ChildWindowId);
	    
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("ashushivam1989@gmail.com");
		
		driver.findElement(By.cssSelector("#phone_number")).sendKeys("9953878292");
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		WebElement ifarme = driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']"));
		
		driver.switchTo().frame(ifarme);
		
		driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]")).click();
		
		
	    
		

	}

}
