package selenium;

// =====================================
// Partial Link

// public class handleLink {
//
// public static void main(String[] args) throws InterruptedException {
// String baseUrl = "file:///C:/My/P/Study/CoreJava/webPages/Sample Link Page
// Demo.html";
// WebDriver driver = new ChromeDriver();
// // /html/body/a[1]
// // /html/body/a[2]
// driver.get(baseUrl);
// Thread.sleep(3000);
//
// driver.findElement(By.partialLinkText("here")).click();
// System.out.println("title of page is: " + driver.getTitle());
// Thread.sleep(3000);
//
// driver.quit();
// }
//
// }
// ===========================

// ==========================
//
// public class handleLink {
//
// public static void main(String[] args) throws InterruptedException {
// String baseUrl = "http://demo.guru99.com/selenium/newtours/";
// WebDriver driver = new ChromeDriver();
//
// String underConsTitle = "Under Construction: Mercury Tours";
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
// driver.get(baseUrl);
// List<WebElement> linkElements = driver.findElements(By.tagName("a"));
// String[] linkTexts = new String[linkElements.size()];
// int i = 0;
//
// // extract the link texts of each link element
// for (WebElement e : linkElements) {
// linkTexts[i] = e.getText();
// i++;
// }
//
// // test each link
// for (String t : linkTexts) {
// driver.findElement(By.linkText(t)).click();
// Thread.sleep(2000);
// if (driver.getTitle().equals(underConsTitle)) {
// System.out.println("\"" + t + "\"" + " is under construction.");
// } else {
// System.out.println("\"" + t + "\"" + " is working.");
// }
// driver.navigate().back();
// }
// driver.quit();
// }
// }
// ============================
