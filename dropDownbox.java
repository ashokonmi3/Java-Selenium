package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//public class dropDownbox {
//
//	public static void main(String[] args) throws InterruptedException {
//		String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseURL);
//		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
//
//		Thread.sleep(10000);
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		Thread.sleep(10000);
//		drpCountry.selectByIndex(18);
//		Thread.sleep(10000);
//		driver.close();
//	}
//}
// ======================================================

//public class dropDownbox {
//
//	public static void main(String[] args) throws InterruptedException {
//		String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseURL);
//		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
//
//		Thread.sleep(10000);
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		Thread.sleep(10000);
//		drpCountry.selectByVisibleText("ANTARCTICA");
//		Thread.sleep(10000);
//		driver.close();
//	}
//}
// ==============================

//public class dropDownbox {
//
//	public static void main(String[] args) throws InterruptedException {
//		String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseURL);
//		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
//
//		Thread.sleep(10000);
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		Thread.sleep(10000);
//		drpCountry.selectByValue("ANTARCTICA");
//		Thread.sleep(10000);
//		driver.close();
//	}
//}
// ======================

// ===================================
// WebDriver driver = new ChromeDriver();
//
// // // Selecting Items in a Multiple SELECT elements
public class dropDownbox {
	//
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByValue("banana");
		Thread.sleep(5000);
		fruits.selectByValue("orange");
		Thread.sleep(5000);
		fruits.selectByValue("apple");
		Thread.sleep(5000);
		System.out.println(" i am after first select");
		fruits.deselectByValue("orange");
		Thread.sleep(5000);
		fruits.deselectAll();
		Thread.sleep(5000);
		driver.close();
	}
}
// =====================================================

// }}
