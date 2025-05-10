package automation.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CommonBase {
	public WebDriver driver;
	public WebDriver initChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
