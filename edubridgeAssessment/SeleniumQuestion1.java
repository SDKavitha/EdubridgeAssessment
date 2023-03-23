package edubridgeAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQuestion1 {
	
	public static void main(String[] args) {
		//Task-1: Access the application URL
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://selenium-apps.doselect.in/change-text/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		
		//Task-2: Find the button for Bigger by id: "bigger" and click on it.
		driver.findElement(By.id("bigger")).click();
		
		//Task-3: Find the button for Smaller by id: "smaller" and click on it.
		driver.findElement(By.id("smaller")).click();
		
		//Task-4: Find the button for Reset by id: "reset" and click on it.
		driver.findElement(By.id("reset")).click();
		
		//Task-5: Find the button Bigger using xpath and click on it.
		driver.findElement(By.xpath("//a[@id='bigger']")).click();
		
		//Task-6: Find the button Smaller using xpath and click on it.
		driver.findElement(By.xpath("//a[@id='smaller']")).click();
		
		//Task-7: Find the button Reset using xpath and click on it.
		driver.findElement(By.xpath("//a[@id='reset']")).click();
		
		
	}

}
