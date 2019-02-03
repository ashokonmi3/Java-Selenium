package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class textArea {

	public static void main(String[] args) throws InterruptedException   {
		
//		System.setProperty("webdriver.gecko.driver","G:\\Saftwares BackUp\\Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sweta\\Desktop\\Manual Testing\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
//Capture Error Message
		
//	    driver.manage().window().maximize();
		
//		driver.get("http://www.gcrit.com/build3/admin/login.php");
        
		// Click on login button
//		driver.findElement(By.id("tdb1")).click();
		        
		// This will capture error message
//		String actual_msg=driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td")).getText();
//		System.out.println(actual_msg);
	
		
		//Handle Window Pop up
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Inda123");
		driver.findElement(By.id("password")).sendKeys("abd");
		
		
		driver.findElement(By.name("proceed")).click();
		String Error_message=driver.findElement(By.className("heading")).getText();
		System.out.println(Error_message);

		Alert alert = driver.switchTo().alert();
		String Error_Message =alert.getText();//Returns Error message .//*[@id='login']/div[2]/div[2]/div[4]/div
		System.out.println(Error_Message);

		alert.accept();//Closes OK Button
		driver.findElement(By.id("login1")).sendKeys("Inda123");;

	
	}

}
