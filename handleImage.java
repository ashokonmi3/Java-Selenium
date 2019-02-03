package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class handleImage {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // General Image (No functionality)
//		driver.get("https://www.google.com");
//		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());// true
//		Thread.sleep(3000);
//		WebElement element1 = driver.findElement(By.id("hplogo"));// true
//
//		System.out.println(element1.getAttribute("width"));
//		System.out.println(element1.getAttribute("src"));
//
//		Thread.sleep(3000);
//
//		driver.quit();
//
//	}
//}

// ================
//public class handleImage {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// Image Button (Submits)
//		driver.get("http://newtours.demoaut.com/");
//		Thread.sleep(3000);
//		WebElement element1 = driver.findElement(By.name("login"));
//		element1.click();
//		Thread.sleep(3000);
//		driver.quit();
//
//	}
//
//}
// =====================
public class handleImage {
	public static void main(String[] args) throws InterruptedException {
		// // image as a link
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.seleniumhq.org/");
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();
		Thread.sleep(5000);

		driver.quit();
		//
	}
	//
}
