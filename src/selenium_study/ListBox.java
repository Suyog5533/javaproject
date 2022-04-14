package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suyog");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wagaskar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("suyogwagaskar1@gmail.com");
		driver.findElement(By.xpath("(//input[@data-type='text'])[4]")).sendKeys("suyogwagaskar1@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Suyog");
		Thread.sleep(500);

	}

}
