package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if (existence == true) {
			System.out.println("Gmail link exists");
		}

		else {
			System.out.println("Gmail link doesnt exists");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
