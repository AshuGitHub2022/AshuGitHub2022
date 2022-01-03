package ashushivamproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block' and normalize-space()='Select Product Type']")).click();
		
		List<WebElement> SelectProductType = (List<WebElement>) driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		for(WebElement slptype:SelectProductType) 
		{
			if(slptype.getText().equals("Travel Insurance"))
			{
				slptype.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block' and normalize-space()='Select Product']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> SelectProduct = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		
		for(WebElement slprdct:SelectProduct)
		{
			if(slprdct.getText().equals("Student Travel Insurance")) 
			{
				slprdct.click();
				break;
			}
		}
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-custom btn-primary-custom myButton exclude-me' and normalize-space()='Apply online']")).click();
		
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//span[@class='dd-link' and normalize-space()='Trip Type']")).click();
		
		List<WebElement> TripType = driver.findElements(By.xpath("//ul[@class='dropdown-list tripType-dropdown clearfix']//li"));
		
		for(WebElement ttype:TripType)
		{
			if(ttype.getText().equals("Family International Travel"))
			{
				ttype.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='dd-link' and normalize-space()='Select Traveller']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Travellers_0__TravellerAge']")).sendKeys("32");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Travellers_1__TravellerAge']")).sendKeys("30");
		Thread.sleep(2000);
		WebElement Child1 = driver.findElement(By.xpath("//label[normalize-space()='Child 1']"));
		Child1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Travellers_2__TravellerAge']")).sendKeys("5");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='dd-link' and normalize-space()='My Parents']")).click();
		Thread.sleep(1000);
		
		WebElement Mother = driver.findElement(By.xpath("//label[normalize-space()='Mother']"));
		Mother.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ParentTraveller_0__TravellerAge']")).sendKeys("50");
		Thread.sleep(1000);
		WebElement Father = driver.findElement(By.xpath("//label[normalize-space()='Father']"));
		Father.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ParentTraveller_1__TravellerAge']")).sendKeys("65");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='cust-btn-red btn_Continue' and normalize-space()='Continue']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
