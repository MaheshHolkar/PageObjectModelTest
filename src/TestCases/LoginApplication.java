package TestCases;

import org.testng.annotations.Test;

import objectRepository.RdiffHomePage;
import objectRepository.RediffLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("Hello");
		rd.Passwd().sendKeys("hello");
		//rd.Submit().click();
		
		rd.Home().click();
		RdiffHomePage rh=new RdiffHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
	}
	
}
