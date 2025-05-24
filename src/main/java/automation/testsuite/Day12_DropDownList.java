package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_DropDownList extends CommonBase{
	@Test
	public void SelectOptionInDropdownList() {
		driver = initChromeDriver("https://codestar.vn/khoa-hoc/");
		Select select = new Select(driver.findElement(By.id("product_categories_filter")));
		select.selectByContainsVisibleText("AWS");
		System.out.println("Số lượng option: " + select.getOptions().size());
		System.out.println("Giá trị sau khi chọn là: " + select.getFirstSelectedOption().getText());
		System.out.println("Select là multiple " + select.isMultiple());
	}
}
