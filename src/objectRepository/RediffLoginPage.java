package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By UserName = By.xpath("//input[@id='login1']");
	By Password = By.name("passwd");
By Submit  =	By.name("proceed");
By Home = By.linkText("rediff.com");
public WebElement EmailId()
{
return 	driver.findElement(UserName);
}
public WebElement Passwd()
{
return 	driver.findElement(Password);
}
public WebElement Submit()
{
return 	driver.findElement(Submit);
}
public WebElement Home()
{
return 	driver.findElement(Home);
}
}
	
	   
	
	
	
