package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Desktop\\JDK SOFTWEAR LINK\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1200);
		driver.manage().window().maximize();	
		int rows = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println("Totals rows are "+rows);
		int columns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th")).size();
		System.out.println("Total columns are "+columns);
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				String text;
	     if(i==1)
	    {
		 text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
		System.out.print(text+" ");
		}
	     else
	     {
	    	 text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
	 		System.out.print(text+" "); 
	     }
	    }
			 System.out.println();
		}

	}

}
