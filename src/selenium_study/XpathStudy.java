package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com//");
        Thread.sleep(2500);
        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Sneha Jadhav");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sneha");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//button[@name='login']")).click();
        
        
//        driver.get("https://www.youtube.com/");
//        Thread.sleep(1500);
//        driver.findElement(By.xpath(null))
	}
	

}
