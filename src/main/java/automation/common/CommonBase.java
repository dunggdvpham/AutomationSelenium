package automation.common;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonBase {
	public static WebDriver driver;
	public int shortWait = 20;
	public int longWait = 50;
	
	public WebDriver initChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public WebElement getElementVisibility(String locator, String type) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(shortWait));
		wait.until(ExpectedConditions.visibilityOfElementLocated(getBy(locator, type)));
		return driver.findElement(getBy(locator, type));
	}
	public void selectOptionFromDropdownByValue(String locator, String type, String value) {
		Select select = new Select(getElementVisibility(locator, type));
		select.selectByValue(value);
	}
	public void VerifySelectedDisplayInDropdown(String locator, String type, String expectedResult) {
		Select select = new Select(getElementVisibility(locator, type));
		assertEquals(select.getFirstSelectedOption().getText(), expectedResult);
	}
	public By getBy(String locator, String type) {
		switch (type.trim().toLowerCase()) {
		case "classname":
			return By.className(locator);
		case "cssselector":
			return By.cssSelector(locator);
		case "id":
			return By.id(locator);
		case "linktext":
			return By.linkText(locator);
		case "xpath":
			return By.xpath(locator);
		case "name":
			return By.name(locator);
		case "partiallinktext":
			return By.partialLinkText(locator);
		case "tagname":
			return By.tagName(locator);
		default:
            throw new IllegalArgumentException("Invalid locator type: " + type);
	}
	}
	public void sleepInSecond(int waitTime) {
		try {
			Thread.sleep(waitTime * 1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
