package automation.testsuite;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Test extends CommonBase{
	public WebDriver driver;
	String url = "https://alada.vn/tai-khoan/dang-nhap.html";
	@Test
	public void locateElementById() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement usernameInput = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("User name: " + usernameInput);
	}
	@Test
	public void locatedElementByName() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement passInput = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("Pass: " + passInput);
	}
	@Test
	public void locatedElementByLinkText() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement forgotPass = driver.findElement(By.linkText("Quên mật khẩu?"));
		System.out.println("Forgot pass: " + forgotPass);
		WebElement noAccount = driver.findElement(By.partialLinkText("Chưa có"));
		System.out.println("No account: " + noAccount);
	}
	@Test
	public void locatedElementByClassName() {
		driver = initChromeDriver(url);
		WebElement collab = driver.findElement(By.className("btn-hoptac"));
		System.out.println("Collaboration: " + collab);
		
		WebElement signup = driver.findElement(By.tagName("button"));
		System.out.println("Signup btn: " + signup);
	}

}
