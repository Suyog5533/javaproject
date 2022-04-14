package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1200);
		WebElement rightclkbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		
		act.contextClick(rightclkbutton).perform();
		Thread.sleep(1500);
		
		act.moveToElement(rightclkbutton, 250, 250).click().perform();
		
		Thread.sleep(1500);
		
		WebElement doubleclkbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act2 = new Actions(driver);
		
		act2.moveToElement(doubleclkbutton).perform();
		act2.doubleClick().perform();
		
		//act2.doubleClick(doubleclkbutton).perform();
		
		
		

	}

}
