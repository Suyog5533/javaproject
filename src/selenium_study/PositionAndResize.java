package selenium_study;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionAndResize {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1200);
		
		Point currentposition = driver.manage().window().getPosition();
		System.out.println(currentposition);
		
		Point p = new Point(125,25);
				Thread.sleep(1200);
		driver.manage().window().setPosition(p);
		
		Dimension currentpagesize = driver.manage().window().getSize();
		System.out.println(currentpagesize);
		Thread.sleep(1200);
		Dimension cs= new Dimension(150, 150);
		driver.manage().window().setSize(cs);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		
		je.executeScript("window.scrollBy(0,300)");
		Thread.sleep(800);
		je.executeScript("window.scrollBy(0,-150)");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File distination= new File("C:\\Users\\suyog\\Desktop\\ss\\positon.png");
	    org.openqa.selenium.io.FileHandler.copy(src, distination);
		
		

	}

}

