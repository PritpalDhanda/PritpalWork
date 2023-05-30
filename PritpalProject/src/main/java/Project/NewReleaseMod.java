package Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.chrome.ChromeDriver;

public class NewReleaseMod {

	
 

			
			//Launching Amazon site
	public static void main(String[] args) {  
			
			
		System.setProperty("webdriver.chrome.driver","/Users/pritpaldhanda/eclipse-workspace/PritpalProject/Driver/chromedriver" );  	
			
			
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();  
		capabilities.setCapability("hi",true);  
		WebDriver driver = new ChromeDriver(capabilities);  
			
			
			
		driver.navigate().to("//https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases");  
			
	
	
	
	
	
	
	
	
	}
	
	
	
}
