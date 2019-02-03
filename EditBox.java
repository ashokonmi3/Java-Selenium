package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class EditBox {
//	//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gcrit.com/build3/admin/login.php");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("admin"); // Entering values in edit box
//		Thread.sleep(5000);
//		//
//		driver.findElement(By.name("username")).sendKeys("admin");
//		Thread.sleep(5000);
//
//		driver.findElement(By.name("username")).sendKeys("user");
//		Thread.sleep(5000);
//
//		driver.quit();
//
//	}
//	//
//}

// ===============================
//
//public class EditBox {
//	// //
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gcrit.com/build3/admin/login.php");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("admin"); // Entering values in edit box
//		// //
//		driver.findElement(By.name("username")).sendKeys("admin");
//		Thread.sleep(5000);
//		//
//		driver.findElement(By.name("username")).clear();
//		Thread.sleep(5000);
//
//		driver.findElement(By.name("username")).sendKeys("user");
//		Thread.sleep(5000);
//
//		driver.quit();
//
//	}
//}
// =======================
//public class EditBox {
//	////
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gcrit.com/build3/admin/");
//		driver.findElement(By.name("username")).sendKeys("admina");
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys("admin@1234");
//		Thread.sleep(5000);
//		driver.findElement(By.id("tdb1")).sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//		driver.quit();
//	}
//
//}
// =============================
//
//public class EditBox {
//	////
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		driver.findElement(By.name("q")).sendKeys("hello -", "Selenium -", "varargs");
//		Thread.sleep(5000);
//		driver.quit();
//
//	}
//
//}

// ================
//
//public class EditBox {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		// press number 1
//		driver.findElement(By.name("q")).sendKeys(Keys.NUMPAD1);
//		// press number 2 key
//		driver.findElement(By.name("q")).sendKeys("\uE01C");
//		Thread.sleep(5000);
//		driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT, "UserName"));
//		Thread.sleep(5000);
//		driver.quit();
//
//	}
//
//}

// ======================
//public class EditBox {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gcrit.com/build3/admin/login.php");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("admin"); // Entering values in edit box
//
//		// driver.findElement(By.name("username")).sendKeys("admin");
//
//		String text = username.getAttribute("value");
//		System.out.println(text);// Return the value in the edit box
//		System.out.println("isDisplayed: " + username.isDisplayed());// Return the
//		// Displayed status
//		System.out.println("Is Enabled: " + username.isEnabled());// Return the
//		// enabled status
//		Thread.sleep(5000);
//
//		driver.quit();
//
//	}
//
//}

// ==============
public class EditBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("file:///C:/My/P/Study/javaselenium/webpages/disabledEditBox.html");
		Thread.sleep(5000);
		WebElement username = driver1.findElement(By.name("lname"));
		// username.sendKeys("admin"); // Entering values in edit box
		Thread.sleep(5000);

		System.out.println("isDisplayed: " + username.isDisplayed());// Return the
		// // Displayed status
		System.out.println("Is Enabled: " + username.isEnabled());// Return the
		// // enabled status
		Thread.sleep(5000);
		//

		// WebDriver driver2 = new ChromeDriver();
		// driver2.get("http://www.gcrit.com/build3/admin/login.php");
		Thread.sleep(5000);
		driver1.quit();
		// driver2.quit();

	}

}