package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableMultiElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1200);
		driver.manage().window().maximize();
	// elemrnts from table	
		List<WebElement> tabletitle = driver.findElements(By.xpath("(//table[@id='product']//tr)[1]"));
		Thread.sleep(1000);
		for (WebElement w:tabletitle)
		{
			System.out.println(w.getText());
		}
		// ==========================================
		//full table
		for(int i=1;i<=11;i++)
		{
		List<WebElement> tabletitle1 = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]"));
		Thread.sleep(1000);
		for (WebElement w:tabletitle1)
		{
			System.out.println(w.getText());
		}
		}

	}

}
