package testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
            { "Stable" },
            { "Edge" }
        };
    }

    @Factory(dataProvider = "dp")
    public Object[]  testFactory(String name) {
        return new FooTest[] { new FooTest(name) };
    }
 
        @BeforeTest
        public void setOptions(XmlTest test)
        {
            test.setGroupByInstances(true);
        }
        
        @BeforeClass
        public void setEnvironment()
        {
        	System.out.println(name);
        }

        @AfterClass
        public void removeEnvironment()
        {
        	System.out.println(name+" will be removed");
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