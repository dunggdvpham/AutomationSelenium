package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.AladaLoginPage;

public class Day13_LoginTest extends BaseCommand{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.ALADA_URL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void LoginSuccessfully() {
		AladaLoginPage login = new AladaLoginPage(driver);
		login.loginFunction("demoemail@gmail.com", "123456");
		WebElement ele_myCourse = driver.findElement(By.xpath("//a[text() = 'Khóa học của tôi' and contains(@class, 'khct')]"));
		assertTrue(ele_myCourse.isDisplayed(), "My course is not displayed");
	}
	@Test
	public void LoginFailedIncorrectEmail() {
		AladaLoginPage login = new AladaLoginPage(driver);
		login.loginFunction("phamdvdungg@gmail.com", "123456");
		WebElement ele_errorMessage = driver.findElement(By.xpath("//p[text() = 'Email này chưa được đăng ký.']"));
		assertTrue(ele_errorMessage.isDisplayed());
	}
}
