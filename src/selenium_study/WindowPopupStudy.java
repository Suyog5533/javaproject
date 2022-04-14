package selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1200);
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		String idofmainpage = driver.getWindowHandle();
		System.out.println("The ID of main page is   "+idofmainpage);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println("Ids of all pages   "+allids);
		
		Iterator<String> idofnextpage= allids.iterator();
		String idofmainpage1 = idofnextpage.next();
		String idofchildpage = idofnextpage.next();
	
		System.out.println("Id of main page  "+idofmainpage1);
		System.out.println("Id of child page  "+idofchildpage);
		
		driver.switchTo().window(idofchildpage);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Velocity is the best");
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();
		driver.switchTo().window(idofmainpage1);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		
		
	}

	
}
