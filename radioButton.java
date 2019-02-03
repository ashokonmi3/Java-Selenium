package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get("http://demoqa.com/registration/");
		driver.get("https://materializecss.com/radio-buttons.html");

		// WebElement maleradioButton =
		// driver.findElement(By.xpath("//input[@name=\"radio_4[]\"]"));
		WebElement maleradioButton = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[3]/label/span"));
		System.out.println(maleradioButton.isDisplayed());
		System.out.println(maleradioButton.isSelected());
		System.out.println(maleradioButton.isEnabled());
		Thread.sleep(5000);
		maleradioButton.click();
		Thread.sleep(5000);

		System.out.println(maleradioButton.isSelected());
		Thread.sleep(5000);

		driver.close();

	}

}
