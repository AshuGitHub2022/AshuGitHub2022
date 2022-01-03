package ashushivamproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ashushivamproject.TestNGListeners.class)
public class UploadFile {
	
@Test
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.cssSelector("span[class='uprcse semi-bold']")).click();
	    
	    WebElement uploadbutton = driver.findElement(By.xpath("(//input[@id='file-upload'])[2]"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click();", uploadbutton);
	    
	    Robot r = new Robot();
	    
	    r.setAutoDelay(2000);
	    
	    StringSelection ss = new StringSelection("E:\\Resume\\Ashutosh Shivam_Resume.doc");
	    r.setAutoDelay(2000);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    r.setAutoDelay(2000);
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
