//Operations on a web Browser

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands1 {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver","G:\\Saftwares
		// BackUp\\Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");

		WebDriver driver = new ChromeDriver(); // opens a blank URL

		// driver.get("https://www.google.co.in"); //opens the given URl

		// Current URL

		// Returns Title of the Browser.
		// driver.get("https://www.google.co.in");
		driver.navigate().to("https://login.yahoo.com/");

		Thread.sleep(3000);

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		// driver.findElement(By.id("lst-ib")).sendKeys("53920");

		// getPageSource()-Returns HTML page source.
		// driver.get("https://www.google.co.in");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// Browser Navigation Methods

		// navigate().to()-Loads a new web page in the current browser window.

		driver.navigate().to("https://login.yahoo.com/");
		Thread.sleep(3000);

		String URL1 = driver.getCurrentUrl();
		System.out.println(URL1);

		// navigate().back()-It moves a single item back in the Browser history.
		driver.navigate().back();
		Thread.sleep(3000);

		String URL2 = driver.getCurrentUrl();
		System.out.println(URL2);

	}

}
