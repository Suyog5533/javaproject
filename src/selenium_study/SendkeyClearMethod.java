package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1200);
        WebElement SuggestionCountry = driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
        
        SuggestionCountry.sendKeys("America");
        Thread.sleep(800);
        SuggestionCountry.clear();
        Thread.sleep(800);
        SuggestionCountry.sendKeys("India");

	}

}
