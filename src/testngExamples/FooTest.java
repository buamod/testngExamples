package testngExamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class FooTest {
	
    private String name;

    public FooTest(String name) {
        this.name = name;
    }


    @DataProvider(name = "dp")
    public Object[][] createData() {
        return new Object[][] {
            { "Cedric" },
            { "Martina" }
        };
    }

    @Factory(dataProvider = "dp")
    public Object[]  testFactory(String name) {
        return new Object[] { new FooTest(name) };
    }
 
    @BeforeTest
    public void setOptions(XmlTest test)
    {
     test.setGroupByInstances(true);
    }

    @Test
    public void test1() throws InterruptedException {
      System.out.println("test1 " + name);
    }

    @Test
    public void test2() throws InterruptedException {
     System.out.println("test2 " + name);
     }
   }