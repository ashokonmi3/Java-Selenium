package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// public class Waits {
// public static void main(String[] args) {
// // // open firefox browser
// WebDriver driver = new ChromeDriver();
// // goto gmail.com
// driver.get("https://www.gmail.com");
// // enter text in username
// driver.findElement(By.xpath("//*[@id='email' type='email'
// ]")).sendKeys("username");
// // enter text in password
// driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("password");
// // click on the signin button
// driver.findElement(By.xpath("//*[@id='signIn']")).click();
// // click on the compose button
// driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE
// L3']")).click();
// driver.quit();
//
// }
// }
// ==================

// public class Waits {
// public static void main(String[] args) throws InterruptedException {
// // open firefox
// WebDriver driver = new ChromeDriver();
// // open google.com
// driver.get("https://google.com");
// // wait for 5 seconds
// Thread.sleep(5000);
// // send text to the search bar
// // click on the search button
// driver.findElement(By.name("q")).sendKeys("selenium-webdriver");
//
// Thread.sleep(5000);
// driver.quit();
//
// }
// }
/*
 * Let us consider practical application in that we are having more the 8 pages
 * and 50 operations if we use Thread.sleep(10000) for 50 times then it is 500
 * seconds around 10 minutes, so the dead time is more but no one prefer to wait
 * .
 */
// ======================
/*
 * applicable only to driver.get() and driver.navigate().to() Page load timeout
 * in selenium requests/set the time limit for a page to load, If the page is
 * not loaded within the given time frame selenium throws TimeOutException
 * exception
 */
// public class Waits {
// public static void main(String[] args) {
// // set chrome driver exe path
// WebDriver driver = new ChromeDriver();
// driver.get("https://google.com");
// // set the time of 30 seconds for page to complete the loading
// driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
// driver.quit();
// }
// }

// ===============================
// public class Waits {
// // /*
// * Implicit Wait WebDriver waits for an element if they are not immediately
// * available. So, WebDriver does not throw NoSuchElementException
// immediately.
// * This is known as implicitlyWait() Disadvantage(i) In any case, it
// blindly
// * wait for given seconds. (ii) Once set, the implicit wait is set for the
// life
// * of the WebDriver object instance.
// // */
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
// driver.get("https://www.google.co.in");
// // // //
// driver.get("https://www.yahoo.com");
// driver.findElement(By.id("identifierId")).sendKeys("India");
// driver.quit();
// }
// //
// }

// If a test case is failing because of element not found we will get the error
// message
// after 15 seconds.
//// ======================================

// // /*
// // * Explicit Wait WebDriver waits for an element if they are not immediately
// // * available. So, WebDriver does not throw NoSuchElementException
// immediately.
// // * This is known as implicitlyWait() Disadvantage(i) In any case, it
// blindly
// // * wait for given seconds. (ii) Once set, the implicit wait is set for the
// // life
// // * of the WebDriver object instance.
// // */
// Implicitly Wait is applicable only to findElement and findElements no other
// statement in selenium.
// public class Waits {
// //
// public static void main(String[] args) throws InterruptedException {
// // open firefox
// WebDriver driver = new ChromeDriver();
// // open google.com
// driver.get("file:///C:/My/P/Study/javaselenium/webpages/ExplicitlyWait.html");
// driver.findElement(By.xpath("//button[@id='alert']")).click();
// WebDriverWait wait = new WebDriverWait(driver, 30 /* timeout in seconds */);
// // throws TimeoutException if no alert is present
// wait.until(ExpectedConditions.alertIsPresent());
// Thread.sleep(5000);
// driver.switchTo().alert().dismiss();
// Thread.sleep(5000);
// driver.quit();
//
// }
// }

// ===============
// public class Waits {
//
// public static void main(String[] args) throws InterruptedException {
// {
// // open firefox
// WebDriver driver = new ChromeDriver();
// // open google.com
// driver.get("file:///C:/My/P/Study/javaselenium/webpages/ExplicitlyWait.html");
// driver.findElement(By.xpath("//button[@id='btn1']")).click();
//// driver.quit();

// }
// }
// }
// =========================

// public class Waits {
//
// public static void main(String[] args) throws InterruptedException {
// {
// // open firefox
// WebDriver driver = new ChromeDriver();
// // open google.com
// driver.get("file:///C:/My/P/Study/javaselenium/webpages/ExplicitlyWait.html");
// driver.findElement(By.id("enable-button")).click();
//
// WebDriverWait wait = new WebDriverWait(driver, 30 /* timeout in seconds */);
//
// // throws TimeoutException if element does not become as clickable in given
// // time
// wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
// // wait.until(ExpectedConditions.);
// Thread.sleep(5000);
//
// // driver.findElement(By.id("enable-button")).click();
// driver.quit();
//
// }
// }
// }
// ====================
public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		// // //
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("shruti.shrivastava.in");
		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		// driver.findElement(By.id("Passwd")).sendKeys("password");
		// driver.findElement(By.id("signIn")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

}

// ========================

// public class Waits {
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
//
// WebDriverWait wait = new WebDriverWait(driver, 20);
// String eTitle = "Demo Guru99 Page";
// String aTitle = "";
// // launch Chrome and redirect it to the Base URL
// driver.get("http://demo.guru99.com/selenium/guru99home/");
// // Maximizes the browser window
// driver.manage().window().maximize();
// // get the actual value of the title
// aTitle = driver.getTitle();
// // compare the actual title with the expected title
// if (aTitle.contentEquals(eTitle)) {
// System.out.println("Test Passed");
// } else {
// System.out.println("Test Failed");
// }
// WebElement guru99seleniumlink;
// guru99seleniumlink =
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
// "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
// guru99seleniumlink.click();
// }
// }
// ===================================

// public class Waits {
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
// // String workingDir = System.getProperty("user.dir");
// driver.get("file:///C:/My/P/Study/javaselenium/fluentwaitpage.html");
//
// FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
// wait.pollingEvery(250, TimeUnit.MILLISECONDS);
// wait.withTimeout(2, TimeUnit.SECONDS);
//
// Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
// public Boolean apply(WebDriver arg0) {
// WebElement element = arg0.findElement(By.id("dynamicColor"));
// String color = element.getCssValue("color");
// System.out.println("The button text has color :" + color);
// if (color.equals("rgba(255, 255, 0, 1)")) {
// return true;
// }
// return false;
// }
// };
//
// wait.until(function);
// }
// }
////// http://www.techbeamers.com/webdriver-fluent-wait-command-examples/