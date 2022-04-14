package sahaj_practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositonSetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1200);
		
		Point p = new Point(125,125);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(1200);
		
		Dimension d = new Dimension(350, 350);
		
		driver.manage().window().setSize(d);
		
		
		
		
		
		
		

	}

}
