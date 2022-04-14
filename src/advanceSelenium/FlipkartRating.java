package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRating {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1200);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 13 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1200);
		List<WebElement> ratings = driver.findElements(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
		Thread.sleep(1500);
		for(WebElement w:ratings)
		{
			System.out.println(w.getText());
		}

	}

}
