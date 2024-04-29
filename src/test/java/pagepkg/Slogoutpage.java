package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slogoutpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburgermenu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;

	public Slogoutpage(WebDriver driver)
	{
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	public void hamburgerclick()
	{
		driver.navigate().back();
		hamburgermenu.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
}
