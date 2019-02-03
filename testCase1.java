package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class testCase1 {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
//		driver.findElement(By.linkText("Create account")).click();
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		if (url.contains("wikipedia.org")) {
//			System.out.println("It is an Internal Link - Redirected to another page in the Same Application - Passed");
//		} else {
//			System.out.println("It is an External Link - Redirected to another page in the Other Application -Failed");
//		}
//
//		Thread.sleep(6000);
//		driver.navigate().back();
//
//		driver.findElement(By.linkText("www.seleniumhq.org")).click(); // click
//		Thread.sleep(6000);
//		System.out.println("URL is: " + driver.getCurrentUrl());
//		if (driver.getCurrentUrl().contains("seleniumhq.org/")) {
//			// if (driver.getCurrentUrl().contains("http://www.yahoo.org/")) {
//
//			System.out.println("It is an External Link - Redirected to another page in the Other Application -Passed");
//		} else {
//
//			System.out.println("It is an Internal Link - Redirected to another page in the same Application -failed");
//		}
//
//		driver.close();
//
//	}
//
//}

//=======================
public class testCase1 {
	public static void main(String... args) {
		WebDriver driver = new ChromeDriver();

		// Login to Admin portal
		driver.get("http://pageobjectpattern.wordpress.com/wp-admin");
		// https://testing572748360.wordpress.com//wp-admin
		WebElement email = driver.findElement(By.id("usernameOrEmail"));
		email.sendKeys("pageobjectpattern@gmail.com");

		driver.findElement(By.className("button form-button is-primary")).click();

		WebElement pwd = driver.findElement(By.id("user_pass"));
		// WebElement submit = driver.findElement(By.Class("button form-button
		// is-primary"));
		email.sendKeys("pageobjectpattern@gmail.com");
		pwd.sendKeys("webdriver123");
		// submit.click();

		// Go to New Posts page
		driver.get("http://pageobjectpattern.wordpress.com/wp-admin/edit.php");
		WebElement addNewPost = driver.findElement(By.linkText("Add New"));
		addNewPost.click();

		// Add New Post
		driver.switchTo().frame("content_ifr");
		WebElement postBody = driver.findElement(By.id("tinymce"));
		postBody.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it to make a type "
				+ "specimen book. It has survived not only five centuries, but also the leap into "
				+ "electronic typesetting, remaining essentially unchanged. "
				+ "It was popularised in the 1960s with the release of Letraset sheets containing "
				+ "Lorem Ipsum passages, and more recently with desktop publishing software like "
				+ "Aldus PageMaker including versions of Lorem Ipsum.");

		driver.switchTo().defaultContent();
		WebElement title = driver.findElement(By.id("title"));
		title.click();
		title.sendKeys("My First Post");
		WebElement publish = driver.findElement(By.id("publish"));
		publish.click();

	}
}
