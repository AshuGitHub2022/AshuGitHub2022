package ashushivamproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Image = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red'", Image);
		
		Thread.sleep(2000);
		
		WebElement DevloperImage = driver.findElement(By.xpath("//div[@class='developer-image sprite-image']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(arguments[0],arguments[1])", DevloperImage.getLocation().x,DevloperImage.getLocation().y);
		
		
		
		
		

	}

}
