package Project;


import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class SearchMoblie extends DriverManager{

	public static WebDriver driver;
		
		WebElement samsunggalaxys10 =driver.findElement(By.id("//*[@id=\"search\"]/div[1]/div[2]/div/div[1]"));
higlightelement(samsunggalaxy10 );


boolean actual=name.isDisplayed();


if(actual==true ){
	name.sendKeys("samsunggalaxy10");

	WebElement samsungegalaxys10 =driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
	higlightelement(samsungegalaxys10);
	Sendclick("//*[@id=\"contextualIngressPtLabel_deliveryShortLine\"]");
}
}
public void click loction {

	
	WebElement location=driver.findElement(By.id("//*[@id=\"contextualIngressPtLabel_deliveryShortLine\"]"));
	

	boolean actual=location.isDisplayed();

	if(actual==true ){
		location.sendKeys("l6y");

		
		WebElement postalcode=driver.findElement(By.id("//*[@id=\"GLUXZipUpdateInput_1\"]"));
		higlightelement(postalcode);
		boolean real=phone.isDisplayed();
		if(real==true) {
			postalcode.sendKeys("3e4");

		
		
		
		
		
		
		

}
	}
	
