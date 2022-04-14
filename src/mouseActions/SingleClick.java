package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement homebutton = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		//act.click(homebutton).perform();
		
		//act.moveToElement(homebutton).perform();
		//act.click().perform();
		
		
		WebElement district = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		act.click(district).perform();
		Thread.sleep(1500);
		
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		

	}

	
}
