package commonFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;

import config.AppUtil;

public class FunctionLibrary  extends AppUtil{
public static  boolean adminLogin(String Username,String Password) throws Throwable{
 {
	driver.get(conpro.getProperty("Url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath(conpro.getProperty("ObjResest")));
	driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(Username);
	driver.findElement(By.xpath(conpro.getProperty("ObjPass"))).sendKeys(Password);
	driver.findElement(By.xpath(conpro.getProperty("Objlogin"))).click();
	String Expected = "dashboard";
	String Actual = driver.getCurrentUrl();
	if(Actual.contains(Expected))
	{
		Reporter.log("Username and Password are Valid::"+Expected+"-----"+Actual,true);
		Thread.sleep(1000);
		//click logout link
		driver.findElement(By.xpath(conpro.getProperty("ObjLogoutLink"))).click();
		return true;
		
	}
	else
	{
		String Errormessage = driver.findElement(By.xpath(conpro.getProperty("ObjError_Message"))).getText();
		driver.findElement(By.xpath(conpro.getProperty("ObjOkbutton"))).click();
		Reporter.log(Errormessage+"------"+Expected+"-------"+Actual,true);
		return false;
		
		
	}
 }
}
public void add()
{
	int a=32,b=87,c;
	c=a+b;
	System.out.println(c);
	
}
public void div()
{
int a=678,b=34,c;
c=a/b;
System.out.println(c);

}
}

