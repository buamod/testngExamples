package testngExamples;

import org.testng.annotations.DataProvider;

public class dataProviderClass {
	
	  @DataProvider(name = "data-provider")
	    public static Object[][] dataProviderMethod() 
	    {
	        return new Object[][] { { "data one" }, { "data two" } };
	    }

}


