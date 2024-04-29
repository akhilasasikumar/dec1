package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepakg.Baseclass;
import pagepkg.Scartpage;
import pagepkg.Scheckoutpage;
import pagepkg.Sloginpage;
import pagepkg.Slogoutpage;
import utilitiypkg.Excelutilities;

public class Slogintest extends Baseclass {

	
		@Test
		public void verifyLogin ()throws Exception
		{
			Sloginpage login=new Sloginpage(driver);
			
			//reading the data from excel file by the specified path
			
			String xl= "C:\\Users\\user\\Desktop\\excel tasks\\Book1.xlsx ";
			String Sheet="Sheet1";
			int rowCount= Excelutilities.getRowCount(xl, Sheet);
			for(int i=1;i<=rowCount;i++)
			{
				String UserName=Excelutilities.getCellValue(xl, Sheet, i, 0);
				System.out.println("username--"+UserName);
				String pswd=Excelutilities.getCellValue(xl, Sheet, i, 1);
				System.out.println("password--"+pswd);
				login.setvalues(UserName,pswd);
				login.clickLoginBtn();
				String expectedurl="https://www.saucedemo.com/inventory.html";
				String actualurl=driver.getCurrentUrl();
				if(actualurl.equals(expectedurl))
				{
					System.out.println("login pass");
				}
				else
				{
					System.out.println("login failed");
				}}
			
			Scartpage cart=new Scartpage(driver);
			cart.addtocart();
			cart.clickcartBtn();
			cart.clickcheckout();
			
			Scheckoutpage checkout=new Scheckoutpage(driver);
			checkout.checkoutinfo("abcz", "defg", "1234");
			checkout.clickcontinue();
			
			Slogoutpage log=new Slogoutpage(driver);
			log.hamburgerclick();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			log.clicklogout();
			}
				
}
