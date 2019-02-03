package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class OpenBrowser_01 {
//	public static void main(String[] args) throws InterruptedException {
//		// // // // Create a new instance of the Firefox driver
//		WebDriver driver = new ChromeDriver(); // Launches chrome Browser with blank
//		driver.get("http://www.store.demoqa.com"); // Launch the Online Store Website
//		System.out.println("Successfully opened the website  www.Store.Demoqa.com");//
//		Thread.sleep(3000); // Wait for 5 Sec
//		driver.quit(); // Close the driver
//	}
//}

// ========================================

public class OpenBrowser_01 {
	//
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // // Create a new instance of the
		// WebDriver driver = new ChromeDriver(); // // Create a new instance of the
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		Thread.sleep(5000);
		//
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(5000);
		//
		driver.findElement(By.name("password")).sendKeys("admin@123");
		// driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(5000);
		//
		// driver.findElement(By.id("tdb1")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("ui-button-text")).click();
		Thread.sleep(5000);

		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Login Successful -Passed");
		} else {
			System.out.println("Login Unsuccessful -Failed");
		}
		Thread.sleep(5000);
		driver.close(); // Closes the Browser

	}
}
//
////// ============================
