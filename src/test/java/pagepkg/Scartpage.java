package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scartpage {


	WebDriver driver;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement bikelight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement bolttshirt;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement fleecejacket ;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement labs ;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement  tshirtred;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement  carticon;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkoutbtn;
	
	public Scartpage(WebDriver driver)
	{
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	public void addtocart()
	{
		backpack.click();
		bikelight.click();
		bolttshirt.click();
		fleecejacket.click();
		labs.click();
		tshirtred.click();
		
		
	}

	public void clickcartBtn()
	{
		carticon.click();
		
	}
	public void clickcheckout()
	{
		checkoutbtn.click();
	
}
	
}
