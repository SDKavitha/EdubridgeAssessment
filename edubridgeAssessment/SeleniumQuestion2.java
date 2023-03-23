package edubridgeAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQuestion2 {

	public static void main(String[] args) {
		//Task-1: Access the application URL
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://selenium-apps.doselect.in/age-calculator/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		
		//Task-2: Find the input for date by id: "birth_date" and enter "12/01/1998".
		driver.findElement(By.id("birth_date")).sendKeys("12/01/1998");
		
		//Task-3: Find the button 'Calculate your age' by id: "calculate" and click.
		driver.findElement(By.id("calculate")).click();
		
		//Task-4: Find the input for date by xpath and enter "26/02/2000".
		driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys("26/02/2000");
		
		//Task-5: Find the button Calculate your age by xpath and click.
		driver.findElement(By.xpath("//div[@id='calculate']")).click();
		
		
		/*String checkAge = driver.findElement(By.xpath("//span[@id='age']")).getText();
		if(checkAge.equalsIgnoreCase("-177 years -10 months -25 days"))
		{
			System.out.println("Test failed");
		}*/

	}

}
