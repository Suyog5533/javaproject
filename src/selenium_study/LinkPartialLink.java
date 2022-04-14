package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialLink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1200);
		driver.findElement(By.linkText("https://rukminim1.flixcart.com/flap/128/128/image/22fddf3c7da4c4f4.png?q=100")).click();
		
		
	}

}
