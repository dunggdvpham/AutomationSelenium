package automation.pageLocators;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_CRMHomePage;

public class CRMStartHomePage extends BaseCommand{
	public WebDriver driver;
	private By btn_AddNew = By.xpath("//button[text() ='Thêm mới']");
	private By btn_Active = By.xpath("//a[contains(text(), 'Kích hoạt')]");
	private By tf_Search = By.name("query");
	private By btn_Search = By.xpath("//button[text() = 'Tìm kiếm']");
	private By lnk_WorkAreaManage = By.xpath("//a[contains(text(), 'Quản lý khu làm việc')]");
	private By tf_FullName = By.name("username");
	private By tf_Email = By.name("email");
	private By tf_Phone = By.name("phone_number");
	private By dd_Department = By.name("department_id");
	private By dd_Role = By.name("role_id");
	private By dd_WorkArea = By.name("workarea_id");
	private By tf_CodeUser = By.name("code_user");
	private By btn_Save = By.xpath("//button[text() = 'Lưu']");
	private By btn_Add = By.xpath("//button[text() = 'Thêm']");
	private By tf_WorkAreaCode = By.name("work_areas_code");
	private By tf_WorkAreaName = By.name("name");
	private By ele_lbl_SuccessToastMessage = By.xpath("//div[@class = 'toast toast-success']");
	private String btn_Delete = "//td[text() = '%s']//parent::tr//a[contains(text(), 'Xóa')]";
	private By p_NoResult = By.xpath("//h4[text() = 'Không tìm thấy kết quả']");
	private String ele_WorkArea = "//td[text() = '%s']//parent::tr";
	
	public CRMStartHomePage FillFormAndSaveNewUser(String username, String email, String phone, String department, String role, String area, String code) {
		sendKeyToElemet(tf_FullName, username);
		sendKeyToElemet(tf_Email, email);
		sendKeyToElemet(tf_Phone, phone);
		selectOptionFromDropdownByText(dd_Department, department);
		selectOptionFromDropdownByText(dd_Role, role);
		selectOptionFromDropdownByText(dd_WorkArea, area);
		sendKeyToElemet(tf_CodeUser, code);
		clickOnElement(btn_Save);
		clickOnElement(btn_Add);
		return this;
	}
	public CRMStartHomePage(WebDriver _driver) {
		this.driver = _driver;
	}
	public CRMStartHomePage isHomePageDisplayed() {
		isElementDisplayed(CT_CRMHomePage.HOMEPAGE_TITLE, Type.Xpath);
		return this;
	}
	public CRMStartHomePage ClickOnAddNew() {
		clickOnElement(btn_AddNew);
		return this;
	}
	public CRMStartHomePage InputValueToSearchBox(String value) {
		sendKeyToElemet(tf_Search, value);
		clickOnElement(btn_Search);
		return this;
	}

	public CRMStartHomePage AccessWorkAreaManagement() {
		clickOnElement(lnk_WorkAreaManage);
		return this;
	}
	public CRMStartHomePage FillFormAndSaveNewWorkArea(String code, String name) {
		sendKeyToElemet(tf_WorkAreaCode, code);
		sendKeyToElemet(tf_WorkAreaName, name);
		clickOnElement(btn_Save);
		clickOnElement(btn_Add);
		return this;
	}
	public CRMStartHomePage VerifySuccessToasMessageDisplay() {
		isElementDisplayed(ele_lbl_SuccessToastMessage);
		return this;
	}
	public CRMStartHomePage DeleteAllWorkAreaWithName(String workAreaName) {
		By elementXpath = By.xpath(String.format(ele_WorkArea, workAreaName));
		By btnDeleteXpath = By.xpath(String.format(btn_Delete, workAreaName));
		List<WebElement> workareas = getAllElementVisibility(elementXpath);
		for (WebElement item : workareas) {
			clickOnElement(btnDeleteXpath);
		}
		return this;
	}
	public CRMStartHomePage VerifyNoResultTextDisplay() {
		isElementDisplayed(ele_lbl_SuccessToastMessage);;
		return this;
	}
	public CRMStartHomePage AcceptAlert() {
		acceptToAlert();
		return this;
	}
	public CRMStartHomePage SwitchToDefaultWindow() {
		switchToDefaultWindown();
		return this;
	}
}
