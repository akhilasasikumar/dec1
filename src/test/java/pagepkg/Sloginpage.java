package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sloginpage {

	WebDriver driver;
	@FindBy(id="user-name")
	WebElement susername;
	
	@FindBy(id="password")
	WebElement spswd;
	
	@FindBy(name="login-button")
	WebElement sLoginBtn;

	public Sloginpage(WebDriver driver)
	{
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	public void setvalues(String username,String PWD)
	{
		susername.clear();
		susername.sendKeys(username);
		spswd.clear();
		spswd.sendKeys(PWD);
	}

	public void clickLoginBtn()
	{
		sLoginBtn.click();
	}
	
}

