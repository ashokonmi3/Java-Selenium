package selenium;

// public class AlertDemo {
// // //
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/P/Study/Python_Selenium/files/Practice_handling_Alerts.html");
// driver.findElement(By.name("alert")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(5000);
// String s = ale.getText();
// System.out.println(s);
// // clicks 'OK' button
// // ale.dismiss();
// ale.accept();
//
// Thread.sleep(5000);
// driver.quit();
//
// }
// }
// =========================

// Confirmation box

// public class AlertDemo {
// // //
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/P/Study/Python_Selenium/files/Practice_handling_Alerts.html");
// driver.findElement(By.name("confirmation")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(5000);
// String s = ale.getText();
// System.out.println(s);
// // clicks 'OK' button
// ale.dismiss();
// Thread.sleep(5000);
// driver.quit();
//
// }
// }
// =================

// =======================

// public class AlertDemo {
// // //
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException, AWTException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/P/Study/Python_Selenium/files/Practice_handling_Alerts.html");
//
// driver.findElement(By.name("prompt")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(2000);
//
// ale.sendKeys("java selenium");
//
// Thread.sleep(5000);
// driver.quit();
//
// }
// }

// ======================
// public class AlertDemo {
// // //
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException, AWTException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/P/Study/Python_Selenium/files/Practice_handling_Alerts.html");
// //
//
// driver.findElement(By.name("prompt")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(2000);
//
// // ale.sendKeys("java selenium");
// ale.sendKeys("abc");
// Thread.sleep(5000);
//
// Robot rb = new Robot();
// rb.keyPress(KeyEvent.VK_WINDOWS);
// rb.keyPress(KeyEvent.VK_PRINTSCREEN);
// rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
// rb.keyRelease(KeyEvent.VK_WINDOWS);
// // clicks 'OK' button
// Thread.sleep(5000);
// driver.quit();
//
// }
// }
// ======================
