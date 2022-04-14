package advanceSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MicrosoftStartMoney {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.msn.com/en-in/money/watchlist?tab=Currency&id=avydm7&cvid=5a78b896f4dd4846b0d069cea9b11851&ocid=winp1taskbar&duration=1D");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='financeWatchlistSuggestion_dismiss-DS-EntryPoint1-2']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("(//button[@class='currencyMenuTop-DS-EntryPoint1-1'])[1]")).click();
		

	}

}
