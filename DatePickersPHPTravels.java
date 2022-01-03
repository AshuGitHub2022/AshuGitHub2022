package ashushivamproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickersPHPTravels {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='uitk-tab-text'][normalize-space()='Flights']")).click();
		
		
		
		String year = "2022";
		String month = "March";
		String date ="22";
		
		driver.findElement(By.cssSelector("#d1-btn")).click();
		
		while(true) {
			try {
		
		String monthyear = driver.findElement(By.xpath("//div[@class='uitk-flex uitk-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']")).getText();
		String arr[] = 	monthyear.split("");
		String mon = arr[0];
		String yr = arr[0];
		
		if(mon.equalsIgnoreCase(month) &&  yr.equals(year))
        break;
        
		else
			
			driver.findElement(By.xpath("(//button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-flex-item uitk-button-paging'])[2]")).click();
		
		
		
		List<WebElement> alldates=driver.findElements(By.xpath("(//div[@class='uitk-date-picker-month'])[2]//button[@class='uitk-date-picker-day uitk-new-date-picker-day']"));
		
		for(WebElement dates:alldates)
		{
			if(dates.getText().equals(date))
			{
				dates.click();
				break;
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
}
