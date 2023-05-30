package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sponserdlink  {
 
	

	public static void main(String[] args){
      
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        
        // Initialize browser
        WebDriver driver=new ChromeDriver();
        
     
        driver.get("https://www.amazon.ca/Samsung-Display-Factory-Unlocked-Smartphone/dp/B09353YZR8/ref=sr_1_2?crid=2SDRI0TCB8F8H&keywords=samsung+galaxy+s10&qid=1684285156&refinements=p_n_feature_twenty-three_browse-bin%3A36773160011&rnid=36773097011&s=wireless&sprefix=samsung+galaxy+s10%2Caps%2C268&sr=1-2");
        
        //Locate the frame1 heading
        WebElement frame1Heading= driver.findElement(By.id(" Sponsored\n"+ "        "));
        
        //Finding the text of the frame1 heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading
        System.out.println("Text of the frame1 heading is:"+frame1Text);
        
        //closing the driver
        driver.close();
}
}

	
	








}
