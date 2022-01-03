package ashushivamproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFluentWaitInSeleDev {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='nav-link' and normalize-space()='Downloads']")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='card-link' and normalize-space()='API Docs'])[3]"));
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(arguments[0],arguments[1])", ele.getLocation().x,ele.getLocation().y);
		Thread.sleep(2000);*/
		ele.click();
		
		driver.findElement(By.xpath("(//a[@href='allclasses-noframe.html'])[1]")).click();
		
		WebElement ele1= driver.findElement(By.xpath("//a[normalize-space()='FluentWait'][@title='class in org.openqa.selenium.support.ui']"));
		
		/*JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(arguments[0],arguments[1])", ele1.getLocation().x,ele1.getLocation().y);
		Thread.sleep(2000);*/
		ele1.click();
		

	}

}
