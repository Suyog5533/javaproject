package sahaj_practise;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class ListBox {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suyog\\\\Desktop\\\\JDK SOFTWEAR LINK\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        WebElement multiselction = driver.findElement(By.xpath("//select[@id='cars']"));
        Select s = new Select(multiselction);
        
        s.selectByVisibleText("Volvo");
        Thread.sleep(500);
        s.selectByIndex(1);
        Thread.sleep(500);
        s.selectByValue("opel");
        Thread.sleep(500);
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String str = RandomString.make('a');
        
        File distination= new File("C:\\Users\\suyog\\Desktop\\ss\\multiselctdropdown1"+str+".jpg");
        
        FileHandler.copy(src, distination);
        
        
	}

}
