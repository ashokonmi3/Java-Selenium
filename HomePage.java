package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
	// By homePageUserName = By.xpath("//table//tr[@class='heading3']");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {
		System.out.println("i am in homepage dashboard");
		return driver.findElement(homePageUserName).getText();

	}

}