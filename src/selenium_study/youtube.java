package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.get("https://www.youtube.com/results?search_query=tujhe+meri+kasam");
		Thread.sleep(1500);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tuze meri kasam");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Tujhe Meri Kasam')])[1]")).click();
	}

}
