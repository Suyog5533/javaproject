package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCompare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1200);
		 WebElement HeadTitle = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		String ActualText = HeadTitle.getText();
		String ExpectedText = "vELOCITY CORPORATE TRAINING CENTER";
		//String ExpectedText = "Velocity Corporate Training Center";
		//if(ActualText.equals(ExpectedText))
			if(ActualText.equalsIgnoreCase(ExpectedText))
		{
		System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}

}
