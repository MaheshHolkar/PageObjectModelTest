package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RediffLoginPagePF {
	
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	By UserName = By.xpath("//input[@id='login1']");
//	By Password = By.name("passwd");
//By Submit  =	By.name("proceed");
//By Home = By.linkText("rediff.com");
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(linkText="rediff.com")
	WebElement home;
	@FindBy(name="proceed")
	WebElement go;
public WebElement EmailId()
{
return 	username;
}
public WebElement Passwd()
{
return password;
}

public WebElement Home()
{
return 	home;
}
}
	
	   
	
	
	
