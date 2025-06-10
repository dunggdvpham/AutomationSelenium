package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.TeduHomePage;
import automation.pageLocators.TeduLoginPage;

public class Day15_DatePicker extends BaseCommand{

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.DEMOGURU_URL);
	}
	
	@Test
	public void inputeDatePicker() {
		WebElement textBday = driver.findElement(By.name("bdaytime"));
		textBday.sendKeys("10152025");
		textBday.sendKeys(Keys.TAB);
		textBday.sendKeys("1030AM");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
	}
}
