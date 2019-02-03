package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class handleMousehover {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		WebDriver driver = new ChromeDriver();
// WebDriver driver= new FirefoxDriver();
// driver.get("https://www.myntra.com/");
// driver.manage().window().maximize();
// // create Action builder instance by passing WebDriver instance
// Actions builder = new Actions(driver);
// WebElement menuElement = driver
// .findElement(By.xpath(".//*[@id='desktop-header-cnt']/div/nav/div/div[1]/div/a"));
// Thread.sleep(5000);
// builder.moveToElement(menuElement).build().perform();
// Thread.sleep(5000);
//
// driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div/nav/div/div[1]/div/div/div/ul[1]/li[6]/a"))
// .click();

//	}
//
//}

// ===============================
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class handleMousehover {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();

		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		Thread.sleep(3000);
		mouseOverHome.perform();
		Thread.sleep(3000);
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();
	}
}
