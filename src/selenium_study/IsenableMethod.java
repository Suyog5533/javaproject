package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsenableMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1200);
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement mobileNoButton = driver.findElement(By.id("mobileNumber"));
		 boolean otpButtonStatus = getOtpButton.isEnabled();
		 
		//WebElement resendOTPButton = driver.findElement(By.xpath("//div[text()='Resend OTP']"));
		
	     
	
		if(otpButtonStatus)
		{
			getOtpButton.click();
			System.out.println("OTP button is already enabled ");
		}
		else
		{
			System.out.println("OTP button is disabled,enter mobile no ");
			mobileNoButton.sendKeys("9552452112");
			Thread.sleep(15000);
			getOtpButton.click();
			//Thread.sleep(22000);
			//resendOTPButton.click();
			
		}
	}

}
