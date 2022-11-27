import org.testng.annotations.*;

public class C_AnnotationsTestCase2 {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Execute Before Suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("Execute After Suite");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Execute Before Class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Execute After Class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Execute Before Method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("Execute After Method");
    }
    @Test
    void test3(){
        System.out.println("Test Case 3");
    }
    @Test
    void test4(){
        System.out.println("Test Case 4");
    }
}
