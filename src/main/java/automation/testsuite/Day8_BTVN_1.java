package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_BTVN_1 extends CommonBase{
	public WebDriver driver;
	public String url = "https://selectorshub.com/xpath-practice-page/";
	@Test
	public void locatedElement() {
		driver = initChromeDriver(url);
		WebElement userEmail = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement company = driver.findElement(By.name("company"));
		WebElement mobileNumber = driver.findElement(By.name("mobile number"));
		System.out.println("User name: " + userEmail);
		System.out.println("Pass: " + pass);
		System.out.println("Company: " + company);
		System.out.println("Mobile number: " + mobileNumber);
	}
}
