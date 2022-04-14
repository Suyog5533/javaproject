package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination = new File("D:\\ss\\ss.png");
	    FileHandler.copy(source, destination);
	}

}
