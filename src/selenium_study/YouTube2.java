package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(1200);
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tv9 Marathi Live");
	    Thread.sleep(1200);
	    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	    Thread.sleep(1200);
	    driver.findElement(By.xpath("(//span[text()='LIVE NOW'])[1]")).click();
	

	}

}
