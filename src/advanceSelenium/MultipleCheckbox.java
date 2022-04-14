package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1200);
		driver.manage().window().maximize();
		List<WebElement> checkboxs = driver.findElements(By.xpath("(//div[@class='extradiv col-lg-3 col-md-6 col-12'])[3]//input"));
		Thread.sleep(1500);
		for(WebElement w:checkboxs)
		{
			w.click();
			Thread.sleep(1500);
		}
		for(WebElement w:checkboxs)
		{
			w.click();
			Thread.sleep(1500);
		}
		
	}

}
