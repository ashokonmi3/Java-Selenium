package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//public class Mousehover {
//
//	public static void main(String[] args) throws InterruptedException {
//		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
//		// System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get(baseUrl);
//		WebElement link_Home = driver.findElement(By.linkText("Home"));
//		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
//				+ "/table/tbody/tr/td" + "/table/tbody/tr"));
//
//		Actions builder = new Actions(driver);
//		Action mouseOverHome = builder.moveToElement(link_Home).build();
//
//		String bgColor = td_Home.getCssValue("background-color");
//		System.out.println("Before hover: " + bgColor);
//		Thread.sleep(3000);
//		mouseOverHome.perform();
//		bgColor = td_Home.getCssValue("background-color");
//		System.out.println("After hover: " + bgColor);
//		Thread.sleep(3000);
//
//		driver.close();
//	}
//}
// ============

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement three = driver.findElement(By.name("three"));
//		WebElement five = driver.findElement(By.name("five"));
//
//		// Add all the actions into the Actions builder.
//		Actions builder = new Actions(driver);
//		builder.keyDown(Keys.CONTROL).click(one).click(three).click(five).keyUp(Keys.CONTROL);
//
//		// Generate the composite action.
//		Action compositeAction = builder.build();
//
//		// Perform the composite action.
//		compositeAction.perform();
//		Thread.sleep(3000);
//
//		driver.close();
//
//	}
//}
// =====================
//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		WebElement three = driver.findElement(By.name("three"));
//		System.out
//				.println("X coordinate: " + three.getLocation().getX() + "Y coordinate: " + three.getLocation().getY());
//		Actions builder = new Actions(driver);
//		Thread.sleep(3000);
//
//		builder.moveByOffset(three.getLocation().getX() + 5, three.getLocation().getY() + 5);
//		Action compositeAction = builder.build();
//
//		compositeAction.perform();
//		Thread.sleep(3000);
//
//		driver.close();
//
//	}
//}

// =========================

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		WebElement three = driver.findElement(By.name("three"));
//		System.out
//				.println("X coordinate: " + three.getLocation().getX() + "Y coordinate: " + three.getLocation().getY());
//		Actions builder = new Actions(driver);
//		Thread.sleep(3000);
//
//		builder.moveByOffset(three.getLocation().getX() + 1, three.getLocation().getY() + 1).click();
//		builder.perform();
//		Thread.sleep(3000);
//
//		driver.close();
//
//	}
//}
// ==============
//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement eleven = driver.findElement(By.name("eleven"));
//		WebElement five = driver.findElement(By.name("five"));
//		int border = 1;
//		int tileWidth = 100;
//		int tileHeight = 80;
//		Thread.sleep(3000);
//
//		Actions builder = new Actions(driver);
//		// Click on One
//		builder.moveByOffset(one.getLocation().getX() + border, one.getLocation().getY() + border).click();
//		builder.build().perform();
//		Thread.sleep(3000);
//
//		// Click on Eleven
//		builder.moveByOffset(2 * tileWidth + 4 * border, 2 * tileHeight + 4 * border).click();
//		builder.build().perform();
//		Thread.sleep(3000);
//
//		// Click on Five
//		builder.moveByOffset(-2 * tileWidth - 4 * border, -tileHeight - 2 * border).click();
//		Thread.sleep(3000);
//
//		builder.build().perform();
//		Thread.sleep(3000);
//
//		driver.close();
//
//	}
//}
// ========================

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		//
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement eleven = driver.findElement(By.name("eleven"));
//		WebElement five = driver.findElement(By.name("five"));
//		Actions builder = new Actions(driver);
//		// Click on One
//		builder.click(one);
//		builder.build().perform();
//		Thread.sleep(3000);
//		// Click on Eleven
//		builder.click(eleven);
//		builder.build().perform();
//		Thread.sleep(3000);
//		// Click on Five
//		builder.click(five);
//		builder.build().perform();
//		Thread.sleep(3000);
//		//
//		driver.close();
//	}
//}
// ====================
//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\selectable.html");
//		// //
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement eleven = driver.findElement(By.name("eleven"));
//		WebElement five = driver.findElement(By.name("five"));
//		Actions builder = new Actions(driver);
//		// Click on One, Eleven and Five
//
//		builder.click(one).click(eleven).click(five);
//		builder.build().perform();
//		Thread.sleep(3000);
//		driver.close();
//
//	}
//}
// ======================
/*
 * The clickAndHold at current location action 1. Move the cursor to the *
 * position of tile 3. 2. Click and hold tile 3. 3. Move the cursor in this
 * position to the tile 2 location.
 */
//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\sortable.html");
//		Thread.sleep(3000);
//
//		Actions builder = new Actions(driver);
//		// Move tile3 to the position of tile2
//		builder.moveByOffset(200, 20).clickAndHold().moveByOffset(120, 0).perform();
//
//		Thread.sleep(3000);
//		driver.close();
//
//	}
//
//}
// ====================

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\sortable.html");
//
//		Actions builder = new Actions(driver);
//		// Move tile3 to the position of tile2
//		builder.moveByOffset(200, 20).clickAndHold().moveByOffset(120, 0).perform();
//		Thread.sleep(3000);
//		driver.close();
//
//	}
//}
// ================
// The release at current location action

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\sortable.html");
//		Thread.sleep(3000);
//
//		WebElement three = driver.findElement(By.name("three"));
//
//		Actions builder = new Actions(driver);
//
//		// Move tile3 to the position of tile2
//		builder.clickAndHold(three).moveByOffset(120, 0).release().perform();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}
// ======================

//public class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\sortable.html");
//		WebElement three = driver.findElement(By.name("three"));
//		WebElement two = driver.findElement(By.name("two"));
//		Actions builder = new Actions(driver);
//		// Move tile3 to the position of tile2
//		builder.clickAndHold(three).release(two).perform();
//		Thread.sleep(3000);
//		driver.close();
//
//	}
//}

// =================
//class Mousehover {
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\Dragme.html");
//		WebElement dragMe = driver.findElement(By.id("draggable"));
//		Actions builder = new Actions(driver);
//		builder.dragAndDropBy(dragMe, 300, 200).perform();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ====================
public class Mousehover {
	public static void main(String... args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:\\My\\P\\Study\\javaselenium\\webpages\\Dragme.html");
		Thread.sleep(3000);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement trgt = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		Thread.sleep(3000);

		builder.dragAndDrop(src, trgt).perform();
		driver.close();

	}
}