package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

//public class testCase4 {

//	public static void main(String[] args) throws InterruptedException {

// WebDriver driver = new ChromeDriver();
// driver.get("http://www.gcrit.com/build3/admin/");
// driver.findElement(By.name("username")).sendKeys("admin");
// driver.findElement(By.name("password")).sendKeys("admin@123");
// driver.findElement(By.id("tdb1")).click();
// String url = driver.getCurrentUrl();
// if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
// System.out.println("Login Successful. Test case passed.");
// } else {
// System.out.println("Login Failed. Test case failed.");
// }
// Thread.sleep(5000);
// driver.close();
//	}
//}

// // ------------------------------
// Negative test case
public class testCase4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admina");
		driver.findElement(By.name("password")).sendKeys("admin@1234");
		driver.findElement(By.id("tdb1")).click();
		String error = driver.findElement(By.className("messageStackError")).getText();
		System.out.println(error);
		Thread.sleep(10000);

		if (error.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Handling error message. Test case passed.");
		} else {
			System.out.println("NOt able to capture error message. Test case failed.");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
