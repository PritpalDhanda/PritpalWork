package Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewValidation {
 
 WebDriver driver = new ChromeDriver();
	
	
	
	
 @Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
		
  }
 @Test (priority = -1)
	public void OpenBrowser() {
		
 driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fnew-releases%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
  String expectedTitle = "login in";
 String originalTitle = driver.getTitle();
 Assert.assertEquals(originalTitle, expectedTitle);
 
 
 }
 
 
 @Test (priority = 2)
 public void OpenBrowser1() {
 
driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fnew-releases%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
String expectedTitle = "login out";
String originalTitle = driver.getTitle();
Assert.assertEquals(originalTitle, expectedTitle);
 



}
 
}
