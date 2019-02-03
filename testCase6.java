package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://demoqa.com/");
		chromeDriver.findElement(By.linkText("Gmail")).click();
		String text = chromeDriver.findElement(By.className("entry-title")).getText();
		System.out.println(text);

		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=1vbg1oj32ole3qrcv4b6mr7m24");
		firefoxdriver.findElement(By.name("firstname")).sendKeys("text");
		Thread.sleep(3000);

		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://in.mail.yahoo.com/");

		chromeDriver.close();

		firefoxdriver.close();
		IEDriver.close();

	}

}
