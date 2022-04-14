package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.switchTo().frame("iframe-name");
		driver.findElement(By.linkText("About us")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//a[text()='About Us']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(2500);
		WebElement listbox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select s = new Select(listbox);
		
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		s.selectByVisibleText("Option2");
		Thread.sleep(50000);
		
		
		driver.quit();
		
		
		

	}

}
