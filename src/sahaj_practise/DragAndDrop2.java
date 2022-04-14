package sahaj_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(1200);
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement distination = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions act = new Actions(driver);
        act.dragAndDrop(source, distination).perform();

	}

}
