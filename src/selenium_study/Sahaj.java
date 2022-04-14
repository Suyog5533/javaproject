package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sahaj {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='css-1r6xg00'])[1]")).click();
		Thread.sleep(5000);
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Generate OTP']"));
		boolean OTPbuttonStatus = OTPButton.isEnabled();
		System.out.println(OTPbuttonStatus);
		Thread.sleep(2000);
		if(OTPbuttonStatus)
		{
			OTPButton.click();
			System.out.println("OTP Button already enable"+OTPButton);
		}
		else
		{
			WebElement mobileNo = driver.findElement(By.xpath("//input[@max='10']"));
			Thread.sleep(2000);
			mobileNo.sendKeys("9765640863");
			OTPButton.click();
			System.out.println("otp send successfully");
		}
	}

}
