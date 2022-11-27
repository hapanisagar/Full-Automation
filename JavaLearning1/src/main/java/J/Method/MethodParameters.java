package J.Method;

public class MethodParameters {
    void myMethod(String Fname, int Age)
    {
        System.out.println(Fname+" is "+Age);
    }

    public static void main(String[] args) {

        MethodParameters obj=new MethodParameters();

        obj.myMethod("Tester",25);
        obj.myMethod("Milan",30);
        obj.myMethod("Tester2",26);
    }
}
