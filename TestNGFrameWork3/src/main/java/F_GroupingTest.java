import org.testng.annotations.Test;

public class F_GroupingTest {

    @Test(groups = {"Regression"})
    void testCase1(){
        System.out.println("Testcase1");
    }
    @Test(groups = {"Smoke"})
    void testCase2(){
        System.out.println("Testcase2");
    }
    @Test(groups = {"Sanity"})
    void testCase3(){
        System.out.println("Testcase3");
    }
    @Test(groups = {"Regression","Sanity"})
    void testCase4(){
        System.out.println("Testcase4");
    }
    @Test(groups = {"Sanity","Smoke"})
    void testCase5(){
        System.out.println("Testcase5");
    }
    @Test(groups = {"Smoke"})
    void testCase6(){
        System.out.println("Testcase6");
    }
}
