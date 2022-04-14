package selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); //hidden-division popup
//		
//		driver.manage().window().minimize();
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Text from popup    "+alt.getText());
		alt.accept();
		driver.manage().window().minimize();
		
		
		

	}

}
