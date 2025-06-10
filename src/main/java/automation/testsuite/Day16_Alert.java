package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;

public class Day16_Alert extends BaseCommand{
	public By btn_OpenAlert = By.xpath("//button[@class = 'btn btn-danger']");
	public By btn_OpenConfirmAlert = By.xpath("//button[@class = 'btn btn-primary']");
	public By btn_OpenInforAlert = By.xpath("//button[@class = 'btn btn-info']");
	public By lnk_AlertWithOK = By.xpath("//a[text() = 'Alert with OK ']");
	public By lnk_AlertWithOKAndCancel = By.xpath("//a[text() = 'Alert with OK & Cancel ']");
	public By lnk_AlertWithTextBox = By.xpath("//a[text() = 'Alert with Textbox ']");
	public By text_YouPressedOk = By.xpath("//p[text() = 'You pressed Ok']");
	public By text_YouPressedCancel = By.xpath("//p[text() = 'You Pressed Cancel']");
	@BeforeMethod
	public void openBrowser() {
		driver= initChromeDriver(CT_PageURL.DEMO_AUTOMATION);
	}
	@Test
	public void alertWithOK() {
		clickOnElement(lnk_AlertWithOK);
		clickOnElement(btn_OpenAlert);
		driver.switchTo().alert().accept();
		assertTrue(isElementDisplayed(btn_OpenAlert));	
	}
	@Test
	public void acceptAlertWithOKAndCancel() {
		clickOnElement(lnk_AlertWithOKAndCancel);
		clickOnElement(btn_OpenConfirmAlert);
		driver.switchTo().alert().accept();
		assertTrue(isElementDisplayed(text_YouPressedOk));
		
	}
	@Test
	public void dismissAlertWithOKAndCancel() {
		clickOnElement(lnk_AlertWithOKAndCancel);
		clickOnElement(btn_OpenConfirmAlert);
		driver.switchTo().alert().dismiss();;
		assertTrue(isElementDisplayed(text_YouPressedCancel));
		
	}
}
