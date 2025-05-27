package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.constants.CT_PracticeForm;

public class Day12 extends BaseCommand{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.DEMO_URL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@Test
	public void clickCheckBox() {
		
		WebElement checkbox_sport = driver.findElement(By.xpath(CT_PracticeForm.CHECKBOX_SPORT));
		WebElement checkbox_reading = driver.findElement(By.xpath(CT_PracticeForm.CHECKBOX_READING));
		WebElement checkbox_music = driver.findElement(By.xpath(CT_PracticeForm.CHECKBOX_MUSIC));
		scrollToElement(checkbox_sport);
		if(checkbox_sport.isSelected() == false)
		checkbox_sport.click();
		if(checkbox_sport.isSelected() == false)
		checkbox_sport.click();
		if(checkbox_sport.isSelected() == false)
		checkbox_sport.click();
	}
	@Test
	public void multipleClickToCheckBox() {
		
		List<WebElement> hobbyList = driver.findElements(By.xpath("//label[contains(@for, 'hobbies-checkbox')]"));
		scrollToElement(hobbyList.get(0));
		for (WebElement hobby : hobbyList) {
			if(hobby.isSelected() == false)
			hobby.click();
		}
	}
	@Test
	public void clickRadioButton() {
		
		WebElement rbutton_male = driver.findElement(By.xpath("//label[@for= 'gender-radio-1']"));
		if (rbutton_male.isEnabled()) {
			rbutton_male.click();
		}
	}
//	@Test
//	public void chooseOptionInDropdownList() {
//		driver = initChromeDriver("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
//		WebElement rbutton_male = driver.findElement(By.xpath("//label[@for= 'gender-radio-1']"));
//		if (rbutton_male.isEnabled()) {
//			rbutton_male.click();
//		}
//	}
}
