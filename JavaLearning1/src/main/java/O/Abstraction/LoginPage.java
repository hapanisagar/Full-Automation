package O.Abstraction;

public class LoginPage extends Pages{
    @Override
    public void header() {
        System.out.println("Login Page Header");

    }@Override
    public void title() {
        System.out.println("Login Page Title");
    }
    public void login(String Uname,String Password){
        System.out.println(Uname+" "+Password);


    }

}

