package sahaj_practise;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		Thread.sleep(1500);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
		
		WebElement distination = driver.findElement(By.xpath("//div[@id='div1']"));

		act.dragAndDrop(source, distination).perform();
	}

}
