package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class Form {
//	public static void main(String[] args) throws InterruptedException {
//
//		// declaration and instantiation of objects/variables
//		WebDriver driver = new ChromeDriver();
//		String baseUrl = "http://demo.guru99.com/test/login.html";
//		driver.get(baseUrl);
//		// // // Get the WebElement corresponding to the Email Address(TextField)
//		WebElement email = driver.findElement(By.id("email"));
//		// // // // // Get the WebElement corresponding to the Password Field
//		WebElement password = driver.findElement(By.name("passwd"));
//		email.sendKeys("abcd@gmail.com");
//		password.sendKeys("abcdefghlkjl");
//		System.out.println("Text Field Set");
//		Thread.sleep(5000);
//		// // // //
//		// // // // // Deleting values in the text box
//		email.clear();
//		// driver.findElement(By.id("email")).clear();
//		// //
//		password.clear();
//		// //
//		System.out.println("Text Field Cleared");
//		Thread.sleep(5000);
//		driver.close();
//	}
//}
// ======================
//public class Form {
//	public static void main(String[] args) throws InterruptedException {
//
//		WebDriver driver = new ChromeDriver();
//		String baseUrl = "http://demo.guru99.com/test/login.html";
//
//		driver.get(baseUrl);
//		WebElement email = driver.findElement(By.id("email"));
//		// // Get the WebElement corresponding to the Password Field
//		WebElement password = driver.findElement(By.name("passwd"));
//		WebElement login = driver.findElement(By.id("SubmitLogin"));
//		// // // // Using click method to submit form
//		email.sendKeys("abcd@gmail.com");
//		password.sendKeys("abcdefghlkjl");
//		Thread.sleep(5000);
//		login.click();
//		System.out.println("Login Done with Click");
//		Thread.sleep(5000);
//		driver.close();
//	}
//}

// ==============Radui Button==============

//public class Form {
//	public static void main(String[] args) throws InterruptedException {
//		//
//		// WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		//
//		driver.get("http://demo.guru99.com/test/radio.html");
//		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//		Thread.sleep(5000);
//
//		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//		Thread.sleep(5000);
//		//
//		// // Radio Button1 is selected
//		radio1.click();
//		System.out.println("Radio Button Option 1 Selected");
//		Thread.sleep(5000);
//
//		// Radio Button1 is de-selected and Radio Button2 is selected
//		radio2.click();
//
//		System.out.println("Radio Button Option 2 Selected");
//		Thread.sleep(5000);
//		driver.close();
//	}
//}
// =====================================
// // // Selecting CheckBox
//public class Form {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		//
//		driver.get("http://demo.guru99.com/test/radio.html");
//		//
//		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
//		Thread.sleep(5000);
//
//		System.out.println("Before clicking " + option1.isSelected());
//		// // This will Toggle the Check box
//		option1.click();
//		Thread.sleep(5000);
//
//		System.out.println("After clicking " + option1.isSelected());
//
//		// // // Check whether the Check box is toggled on
//
//		Thread.sleep(5000);
//		driver.close();
//	}
//}
// ====================================
// Selecting Checkbox and using isSelected Method
public class Form {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 4; i++) {
			chkFBPersist.click();
			Thread.sleep(3000);
			System.out.println("Facebook Persists Checkbox Status is - " + chkFBPersist.isSelected());
		}
		driver.close();
	}
}