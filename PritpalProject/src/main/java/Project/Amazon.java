package Project;


import org.apache.commons.validator.routines.UrlValidator;

public class Amazon {

	public static void main(String[] args) {
	
	
UrlValidator AmazonURLValidator = new UrlValidator();

String url = "https://www.amzn.ca";



if (AmazonURLValidator.isValid(url)) {
	AmazonLog("Hey. URL " + url + " is valid");
	
} else {
	AmazonLog("Hey. URL " + url + " is not valid");
		
	
}

String invalidURL = "https://www.amazon.can";
if (AmazonURLValidator.isValid(invalidURL)) {
	AmazonLog("Hey. URL " + invalidURL + " is valid");
	
	

} else {
	AmazonLog("Hey. URL " + invalidURL + " is not valid");
}

	
 }
    
   
	
	
	
	
	}
	
	
	
	
	

