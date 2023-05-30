package Test;

import org.testng.annotations.Test;


import org.junit.runners.Parameterized.Parameters;

public class NewTest {
  @Test
  @Parameters
  public void ParametersTest(String valid) {
  
	  System.out.println("Parameterized value is : " + valid);
  
  }	
  @Test1
  @Parameters
  public void ParametersTest1(String invalid) {
  
	  System.out.println("Parameterized value is : " + invalid);
  
  }	


}


