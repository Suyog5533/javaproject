package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suyog");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wagaskar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("suyogwagaskar1@gmail.com");
		driver.findElement(By.xpath("(//input[@data-type='text'])[4]")).sendKeys("suyogwagaskar1@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Suyog");
		Thread.sleep(500);
		//creating object to select day of birth using selectByVisibleText method
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s= new Select(day);
		Thread.sleep(500);
		s.selectByVisibleText("1");
		Thread.sleep(500);
		s.selectByVisibleText("15");
		Thread.sleep(500);
		s.selectByVisibleText("20");
		Thread.sleep(500);
		s.selectByVisibleText("27");
//		
//		//creating object to select month of birth using selectByIndex method
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s1=new Select(month);
		
		s1.selectByIndex(1);
		Thread.sleep(500);
		s1.selectByIndex(10);
		Thread.sleep(500);
		s1.selectByIndex(3);
//		
//		//creating object to select year of birth using selectByIndex method
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		
		s2.selectByValue("2020");
		Thread.sleep(500);
		s2.selectByValue("1992");
		Thread.sleep(500);
		s2.selectByValue("1995");
		Thread.sleep(500);
		s2.selectByValue("1997");

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}

}
