package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(1200);
		
		WebElement ref=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		
        JavascriptExecutor je = ((JavascriptExecutor)driver);
		
//		je.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(800);
//		je.executeScript("window.scrollBy(0,-150)");
		
		je.executeScript("arguments[0].scrollIntoView();",ref);

	}

}
