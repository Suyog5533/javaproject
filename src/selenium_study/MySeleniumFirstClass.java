package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumFirstClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://meet.google.com/");
      
        //driver.close();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.close();
       
        System.out.println("The current URL is"   +driver.getCurrentUrl());
        System.out.println("The current URL is"   +driver.getTitle());
        
	}

}
