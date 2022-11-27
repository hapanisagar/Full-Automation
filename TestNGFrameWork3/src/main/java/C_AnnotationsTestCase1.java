import org.junit.BeforeClass;
import org.testng.annotations.*;

public class C_AnnotationsTestCase1 {
    @BeforeClass
    void beforeTests(){
        System.out.println("Execute Before Tests");
    }
    @AfterTest
    void afterTests(){
        System.out.println("Execute After Tests");
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
    void test1(){
        System.out.println("Test Case 1");
    }
    @Test
    void test2(){
        System.out.println("Test Case 2");
    }


}

