package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheckoutpage {
	
	WebDriver driver;
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(name="login-button")
	WebElement sLoginBtn;
	    
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement szipcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebtn;

	public Scheckoutpage(WebDriver driver)
	{
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	public void checkoutinfo(String fname,String lname,String zipcode)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		szipcode.sendKeys(zipcode);
		
	}
	
	public void clickcontinue() {
		continuebtn.click();
	}
	
}
