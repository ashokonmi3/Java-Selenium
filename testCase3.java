package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		// Thread.sleep(8000);
		driver.findElement(By.id("name_3_firstname")).sendKeys("abc");
		Thread.sleep(2000);

		driver.findElement(By.id("name_3_lastname")).sendKeys("xyz");
		Thread.sleep(2000);

		driver.findElement(By.name("radio_4[]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[1]")).click();// checkbox_5[]
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.name("dropdown_7")));
		Thread.sleep(2000);

		dropdown.selectByVisibleText("India");
		Thread.sleep(2000);

		driver.findElement(By.id("phone_9")).sendKeys("8095157772");
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("swetar1");
		Thread.sleep(2000);

		driver.findElement(By.id("email_1")).sendKeys("acharya87@rediffmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("password_2")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.id("confirm_password_password_2")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.name("pie_submit")).click();
		Thread.sleep(8000);
		//

	}

}
