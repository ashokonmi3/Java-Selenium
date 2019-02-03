package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		// WebElement glink =
		// driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
		WebElement glink = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));

		glink.click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ashokonmi@gmail.com");
		Thread.sleep(3000);
		WebElement bnext = driver.findElement(By.id("identifierNext"));
		bnext.click();
		Thread.sleep(3000);
		// if(url.contains("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=1&navigationDirection=forward"))
		// {
		driver.findElement(By.name("password")).sendKeys("asharma1");
		WebElement bpnext = driver.findElement(By.id("passwordNext"));
		bpnext.click();
		Thread.sleep(20000);
		/*
		 * String url = driver.getCurrentUrl(); System.out.print(url);
		 * driver.navigate().to(url);
		 * 
		 */
		// driver.findElement(By.cssSelector("#\\3a j0 > div > div")).click();
		driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();

	}

}
