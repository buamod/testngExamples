package testngExamples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  private String type;

@Test
  public void firstTest() {
	  System.out.println("the first test case with the type : "+ type);
  }

@Test
  public void secondTest() {
	  System.out.println("the second test case with the type : "+ type);
  }
  
  @Factory(dataProvider = "data-provider", dataProviderClass = dataProviderClass.class) //(dataProvider="dataProviderMethod")
  public NewTest(String type){
      this.type=type;
      System.out.println("test the = "+type);
  }

//  @DataProvider(parallel=false)
//  public static Object[][] dataProviderMethod() {
//	  
//	  return new Object[][] {
//		    new Object[] { "Stable" },
//		    new Object[] { "Edge" }};
//  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
