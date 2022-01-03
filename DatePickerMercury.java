package ashushivamproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ashushivamproject.TestNGListeners.class)

public class DatePickerMercury {
	static WebDriver driver;
	
	@Test

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@id='flights']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='Round Trip']")).click();
		
		driver.findElement(By.name("fromCity")).sendKeys("Sydney, Australia - Kingsford Smith (SYD)");
		
		driver.findElement(By.name("toCity")).sendKeys("Bogalusa, United States - George R Carr (BXA)");
		
		String year = "2022";
		String month = "January";
		String date = "1";
		
		driver.findElement(By.id("dpf1")).click();
		
		while(true) 
		{
			String monthyear = driver.findElement(By.xpath("//body/div[11]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
			
			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
			break;
			
			else
			
				driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/thead/tr[1]/th[3]")).click();
				
			
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("(//div[@class='datepicker dropdown-menu'])[3]//td"));
		
		for(WebElement dates:alldates) 
		{
			if(dates.getText().equals(date)) 
			{
				dates.click();
				break;
			}
			
			
		}
		
		String YEAR = "2022";
		String MONTH= "Feburary";
		String DATE = "2";
		
		driver.findElement(By.id("dpf2")).click();
		
		while(true) 
		{
			try {
			String MonthYear = driver.findElement(By.xpath("//body/div[12]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
			String arr[] = MonthYear.split(" ");
			String Mon1 = arr[0];
			String Year1= arr[1];
			
				
			
			if(Mon1.equalsIgnoreCase(MONTH) && Year1.equals(YEAR))
				break;
			else
				driver.findElement(By.xpath("//body/div[12]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
			
			List<WebElement> ALLDATES = driver.findElements(By.xpath("(//div[@class='datepicker dropdown-menu'])[4]//td"));
			
			for(WebElement DATES:ALLDATES)
			{
				if(DATES.getText().equals(DATE)) 
				{
					DATES.click();
					break;	
				
				}
				
			}
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			
			
		
		
		WebElement drpAdults = driver.findElement(By.cssSelector("#Adults"));
		Select drp1 = new Select(drpAdults);
		drp1.selectByValue("4");
		
		WebElement drpChilds = driver.findElement(By.cssSelector("#Childs"));
		Select drp2 = new Select(drpChilds);
		drp2.selectByValue("8");
		
		WebElement drpInfants = driver.findElement(By.cssSelector("#Infants"));
		Select drp3 = new Select(drpInfants);
		drp3.selectByValue("1");
		
		WebElement ClsOFTravel = driver.findElement(By.xpath("(//select[@name='cabinClass'])[1]"));
		Select drp4 = new Select(ClsOFTravel);
		drp4.selectByValue("P");
		
		driver.findElement(By.cssSelector("#searchFlightsBtn")).click();
	}
}
}

/* }
		
		WebElement drpAdults = driver.findElement(By.cssSelector("#Adults"));
		selectMultipleOptionsdrpdown(drpAdults,"4");
		
		WebElement drpChilds = driver.findElement(By.cssSelector("#Childs"));
		selectMultipleOptionsdrpdown(drpChilds,"8");
		
		WebElement drpInfants = driver.findElement(By.cssSelector("#Infants"));
		selectMultipleOptionsdrpdown(drpInfants,"1");
		
		WebElement ClsOFTravel = driver.findElement(By.xpath("(//select[@name='cabinClass'])[1]"));
		selectMultipleOptionsdrpdown(ClsOFTravel,"Premium First Class");
		
		driver.findElement(By.cssSelector("#searchFlightsBtn")).click();
		
			
		
		
	}

	private static void selectMultipleOptionsdrpdown(WebElement ele, String value) {
		Select drp = new Select(ele);
		
		List<WebElement> allOptions = drp.getOptions();
		 for(WebElement options:allOptions)
		 {
			 if(options.getText().equals(value))
			 {
				 options.click();
				 break;
			 }
		 }
		
	}

}*/



	