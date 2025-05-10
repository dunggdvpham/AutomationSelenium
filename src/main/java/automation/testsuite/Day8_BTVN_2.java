package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_BTVN_2 extends CommonBase{
	public WebDriver driver;
	public String url = "https://automationfc.github.io/basic-form/index.html";
	public JavascriptExecutor js;
	@Test
	public void locateElement() {
		driver = initChromeDriver(url);
		js = (JavascriptExecutor) driver;
		
		WebElement name = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].scrollIntoView(true);", name);
		WebElement address = driver.findElement(By.id("address"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
		System.out.println("Pass: " + password);
	}
}
