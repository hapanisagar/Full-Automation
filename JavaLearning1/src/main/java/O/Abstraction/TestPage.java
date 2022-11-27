package O.Abstraction;

public class TestPage {
    public static void main(String[] args){
        LoginPage L=new LoginPage();
        L.header();
        L.title();
        L.logout();
        L.login("Test","Tester123");


    }
}
