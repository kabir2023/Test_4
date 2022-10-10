import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation4 {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamra_0b9xx0w\\Desktop\\SELENIUM FILE\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void catagory() {
		WebElement catagory = driver.findElement(By.name("data"));
		catagory.sendKeys("kamran abir 1");
		driver.findElement(By.xpath("//div[@class=\"advance-controls\"]//descendant::input[2]")).click();
		
	}

}
