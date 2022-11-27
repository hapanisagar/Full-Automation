import org.testng.annotations.Test;

public class E_DependancyTestCase {
    @Test
    void login(){
        System.out.println("User able to login");
       // Assert.fail();  connected with line no 17 always run=true
    }


    @Test(dependsOnMethods = "login")
    void findProduct(){
        System.out.println("User able to find Product");

    }
   // @Test(dependsOnMethods = {"findProduct"},alwaysRun = true) //use this method if you want to run specific test case any how
    @Test(dependsOnMethods = "findProduct")
    void addProduct(){
        System.out.println("User able to add Product");
    }
    @Test(dependsOnMethods = "addProduct")
    void buyProduct(){
        System.out.println("User able to buy Product");
    }

}
